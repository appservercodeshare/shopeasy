package com.shopeasy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopeasy.constants.StatusConstants;
import com.shopeasy.controllers.beans.Login;
import com.shopeasy.controllers.beans.Registration;
import com.shopeasy.controllers.beans.User;
import com.shopeasy.services.ShopEasyService;
import com.shopeasy.utils.Utils;

@RestController
public class ShopEasyController {

	@Autowired
	@Qualifier("shopEasyService")
	private ShopEasyService shopEasyService;
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
	public User login(Login login) {
		
		User user = Utils.getUser(shopEasyService.login(Utils.getLoginBean(login)));
		
		if(Utils.isEmptyOrNull(user)) {
			user.setStatus(StatusConstants.INVALID_LOGIN.getStatusCode());
		} else {
			user.setStatus(StatusConstants.VALID_LOGIN.getStatusCode());	
		}
		
		return user;
	}
	
	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public Registration register(Registration registration) {
		
		Integer otp = shopEasyService.registerMobileNumber(Utils.getRegistrationBean(registration));
		if(otp > -1) {
			registration.setStatus(StatusConstants.REGISTRATION_SUCCESS.getStatusCode());	
		} else {
			registration.setStatus(StatusConstants.REGISTRATION_FAILED.getStatusCode());
		}
		
		return registration;
	}
	
	@RequestMapping(value = "/signup", method = {RequestMethod.POST})
	public User signup(User user) {
		
		boolean flag = shopEasyService.signup(Utils.getUserBean(user));
		
		if(flag) {
			user.setStatus(StatusConstants.SIGNUP_SUCCESS.getStatusCode());
		} else {
			user.setStatus(StatusConstants.REGISTRATION_FAILED.getStatusCode());	
		}
		
		return user;
	}
}
