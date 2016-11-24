package com.shopeasy.daos;

import com.shopeasy.persistences.beans.LoginBean;
import com.shopeasy.persistences.beans.RegistrationBean;
import com.shopeasy.persistences.beans.UserBean;

public interface ShopEasyDao {
	public UserBean login(LoginBean  loginBean);
	public void registerMobileNumber(RegistrationBean registrationBean);
	public RegistrationBean getRegisteredMobileDetails(RegistrationBean registrationBean);
	public RegistrationBean getRegistrationBeanByMobileNumber(RegistrationBean registrationBean);
	public boolean signup(UserBean userBean);
	public UserBean getUserByMobileNumber(UserBean userBean);
	public RegistrationBean getRegistrationBeanByOtp(RegistrationBean registrationBean);
	
}
