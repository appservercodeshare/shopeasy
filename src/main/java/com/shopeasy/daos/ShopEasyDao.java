package com.shopeasy.daos;

import com.shopeasy.persistences.beans.LoginBean;
import com.shopeasy.persistences.beans.RegistrationBean;
import com.shopeasy.persistences.beans.UserBean;

public interface ShopEasyDao {
	public UserBean login(LoginBean  loginBean);
	public Integer registerMobileNumber(RegistrationBean registrationBean);
	public boolean signup(UserBean userBean);
	
}
