package com.shopeasy.daos.impls;

import java.io.Serializable;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.shopeasy.daos.AbstractCurdDao;
import com.shopeasy.daos.ShopEasyDao;
import com.shopeasy.jms.services.OtpService;
import com.shopeasy.persistences.beans.LoginBean;
import com.shopeasy.persistences.beans.RegistrationBean;
import com.shopeasy.persistences.beans.UserBean;
import com.shopeasy.utils.Utils;

public class ShopEasyDaoImpl extends AbstractCurdDao implements ShopEasyDao {

	@Override
	public UserBean login(LoginBean loginBean) {
		Session session = getSession();
		Criteria loginQuery = session.createCriteria(UserBean.class);
		loginQuery.add(Restrictions.eq("username", loginBean.getUsername()));
		loginQuery.add(Restrictions.eq("password", loginBean.getPassword()));
		UserBean dbUserBean = (UserBean) loginQuery.uniqueResult(); 
		return dbUserBean;
	}

	@Override
	public Integer registerMobileNumber(RegistrationBean registrationBean) {
		Integer newOTP = OtpService.getNewOTP(1000, 9999);
		registrationBean.setOtp(newOTP);
		try {
			save(registrationBean);
		} catch(Exception e) {
			newOTP = -1;
		}
		return newOTP;
	}

	@Override
	public boolean signup(UserBean userBean) {
		Serializable id = save(userBean);
		if(Utils.isEmptyOrNull(id)) {
			return true;
		}
		return false;
	}

}
