package com.shopeasy.services.impls;

import javax.transaction.Transactional;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shopeasy.constants.StatusConstants;
import com.shopeasy.controllers.beans.Registration;
import com.shopeasy.daos.ShopEasyDao;
import com.shopeasy.jms.services.OtpService;
import com.shopeasy.persistences.beans.LoginBean;
import com.shopeasy.persistences.beans.RegistrationBean;
import com.shopeasy.persistences.beans.UserBean;
import com.shopeasy.services.ShopEasyService;
import com.shopeasy.utils.Utils;

@Service
@Qualifier(value = "shopEasyService")
@Transactional
public class ShopEasyServiceImpl implements ShopEasyService {

	@Autowired
	private ShopEasyDao shopEasyDao;
	
	@Override
	public UserBean login(LoginBean loginBean) {
		return shopEasyDao.login(loginBean);
	}

	@Override
	public StatusConstants registerMobileNumber(RegistrationBean registrationBean, Registration registration) {
		Integer newOTP = OtpService.getNewOTP(1000, 9999);
		StatusConstants statusConstant = null;
		
		RegistrationBean dbRegistrationBean = null;
		try {
			dbRegistrationBean = shopEasyDao.getRegistrationBeanByMobileNumber(registrationBean);
			if(Utils.isEmptyOrNull(dbRegistrationBean)) {
				registrationBean.setOtp(newOTP);
				shopEasyDao.registerMobileNumber(registrationBean);
				statusConstant = StatusConstants.REGISTRATION_SUCCESS;
			} else {
				statusConstant = StatusConstants.DUPLICATE_REGISTRATION;
			}
		} catch (Exception e) {
			statusConstant = StatusConstants.DB_OPERATION_FAILED;
			newOTP = null;
		}
		
		if(!Utils.isEmptyOrNull(registration)) {
			registration.setOtp(newOTP);
			registration.setStatus(statusConstant.getStatusCode());
			registration.setStatusDescription(statusConstant.getDescription());
		}
		return statusConstant;
	}

	@Override
	public StatusConstants signup(UserBean userBean) {
		
		RegistrationBean dbRegistrationBean = null;
		StatusConstants statusConstant = null;
		
		try {

			RegistrationBean registrationBean = new RegistrationBean();
			registrationBean.setMobileNumber(userBean.getMobileNumber());
			registrationBean.setOtp(userBean.getOtp());
			dbRegistrationBean = shopEasyDao.getRegisteredMobileDetails(registrationBean);
			
			if(!Utils.isEmptyOrNull(dbRegistrationBean)) {
				UserBean dbUserBean = shopEasyDao.getUserByMobileNumber(userBean);
				if(Utils.isEmptyOrNull(dbUserBean)) {
					shopEasyDao.signup(userBean);
					statusConstant = StatusConstants.DB_OPERATION_SUCCESS;
				} else {
					statusConstant = StatusConstants.DUPLICATE_SIGNUP;
				}
			} else if (Utils.isEmptyOrNull(shopEasyDao.getRegistrationBeanByMobileNumber(registrationBean))) {
					statusConstant = StatusConstants.UNREGISTERED_MOBILE_NUMBER;
			} else { 
				statusConstant = StatusConstants.INVALID_OTP;
			}
		} catch (Exception e) {
			statusConstant = StatusConstants.DB_OPERATION_FAILED;
			e.printStackTrace();
		}
		
		return statusConstant;
	}

}