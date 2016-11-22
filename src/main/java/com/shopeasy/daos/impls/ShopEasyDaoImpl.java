package com.shopeasy.daos.impls;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.shopeasy.daos.AbstractCurdDao;
import com.shopeasy.daos.ShopEasyDao;
import com.shopeasy.jms.services.OtpService;
import com.shopeasy.persistences.beans.LoginBean;
import com.shopeasy.persistences.beans.RegistrationBean;
import com.shopeasy.persistences.beans.UserBean;
import com.shopeasy.utils.Utils;

@Repository
@Qualifier(value = "shopEasyDao")
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
	public void registerMobileNumber(RegistrationBean registrationBean) {
		save(registrationBean);
	}

	@Override
	public boolean signup(UserBean userBean) {
		Serializable id = save(userBean);
		if(!Utils.isEmptyOrNull(id)) {
			return true;
		}
		return false;
	}
	
	@Override
	public RegistrationBean getRegisteredMobileDetails(RegistrationBean registrationBean) {
		Session session = getSession();
		RegistrationBean dbRegistrationBean = null;
		Criteria registerMobQuery = session.createCriteria(RegistrationBean.class);
		registerMobQuery.add(Restrictions.eq("mobileNumber", registrationBean.getMobileNumber()));
		registerMobQuery.add(Restrictions.eq("otp",registrationBean.getOtp()));
		List<RegistrationBean> registrationBeanList = registerMobQuery.list();
		if(!registrationBeanList.isEmpty()) {
			dbRegistrationBean = registrationBeanList.get(0);	
		}
		
		return dbRegistrationBean;
	}
	
	@Override
	public RegistrationBean getMobileNumber(RegistrationBean registrationBean) {
		
		Session session = getSession();
		RegistrationBean dbRegistrationBean = null;
		Criteria registerMobQuery = session.createCriteria(RegistrationBean.class);
		registerMobQuery.add(Restrictions.eq("mobileNumber", registrationBean.getMobileNumber()));
		List<RegistrationBean> registrationBeanList = registerMobQuery.list();
		if(!registrationBeanList.isEmpty()) {
			dbRegistrationBean = registrationBeanList.get(0);
		}
		return dbRegistrationBean;
	}
	
	@Override
	public UserBean getUserByMobileNumber(UserBean userBean) {
		Session session = getSession();
		UserBean dbUserBean = null;
		Criteria userBeanQuery = session.createCriteria(UserBean.class);
		userBeanQuery.add(Restrictions.eqOrIsNull("mobileNumber", userBean.getMobileNumber()));
		List<UserBean> userBeanList = userBeanQuery.list();
		if(!userBeanList.isEmpty()) {
			dbUserBean = userBeanList.get(0);
		}
		
		return dbUserBean;
	}

}
