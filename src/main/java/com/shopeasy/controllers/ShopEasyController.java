package com.shopeasy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopeasy.constants.StatusConstants;
import com.shopeasy.controllers.beans.Login;
import com.shopeasy.controllers.beans.Registration;
import com.shopeasy.controllers.beans.User;
import com.shopeasy.persistences.beans.UserBean;
import com.shopeasy.services.ShopEasyService;
import com.shopeasy.utils.Utils;

@RestController
public class ShopEasyController {

	@Autowired
	@Qualifier("shopEasyService")
	private ShopEasyService shopEasyService;
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
	public User login(@RequestBody Login login) {
		
		User user = null;
		UserBean userBean = shopEasyService.login(Utils.getLoginBean(login));
		if(!Utils.isEmptyOrNull(userBean)) {
			user = Utils.getUser(userBean);
			user.setStatus(StatusConstants.VALID_LOGIN.getStatusCode());
			user.setStatusDescription(StatusConstants.VALID_LOGIN.getDescription());
		} else {
			user = new User();
			user.setUsername(login.getUsername());
			user.setPassword(login.getPassword());
			user.setStatus(StatusConstants.INVALID_LOGIN.getStatusCode());
			user.setStatusDescription(StatusConstants.INVALID_LOGIN.getDescription());
		}
		return user;
	}
	
	@RequestMapping(value = "/register", method = {RequestMethod.POST}, consumes="application/json", produces = "application/json")
	public Registration register(@RequestBody Registration registration) {
		shopEasyService.registerMobileNumber(Utils.getRegistrationBean(registration), registration);
		return registration;
	}
	
	@RequestMapping(value = "/signup", method = {RequestMethod.POST})
	public User signup(@RequestBody User user) {
		
		StatusConstants statusConstant = shopEasyService.signup(Utils.getUserBean(user));
		
		user.setStatus(statusConstant.getStatusCode());
		user.setStatusDescription(statusConstant.getDescription());
		return user;
	}
}
