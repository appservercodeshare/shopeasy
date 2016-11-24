package com.shopeasy.services;

import com.shopeasy.constants.StatusConstants;
import com.shopeasy.controllers.beans.Registration;
import com.shopeasy.persistences.beans.LoginBean;
import com.shopeasy.persistences.beans.RegistrationBean;
import com.shopeasy.persistences.beans.UserBean;

public interface ShopEasyService {

	public UserBean login(LoginBean loginBean);
	public StatusConstants registerMobileNumber(RegistrationBean registrationBean, Registration registration);
	public StatusConstants signup(UserBean userBean);
}

