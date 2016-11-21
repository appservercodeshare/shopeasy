package com.shopeasy.utils;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.shopeasy.controllers.beans.Login;
import com.shopeasy.controllers.beans.Registration;
import com.shopeasy.controllers.beans.User;
import com.shopeasy.persistences.beans.LoginBean;
import com.shopeasy.persistences.beans.RegistrationBean;
import com.shopeasy.persistences.beans.UserBean;

public class Utils {

	/*
	 * Following methods convert from persistence beans to controller beans 
	 */
	public static LoginBean getLoginBean(Login login) {

		LoginBean loginBean = null;

		try {
			loginBean = new LoginBean();
			BeanUtils.copyProperties(loginBean, login);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

		return loginBean;
	}

	public static RegistrationBean getRegistrationBean(Registration registration) {

		RegistrationBean registrationBean = null;

		try {
			registrationBean = new RegistrationBean();
			BeanUtils.copyProperties(registrationBean, registration);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return registrationBean;
	}

	public static UserBean getUserBean(User user) {

		UserBean userBean = null;

		try {
			userBean = new UserBean();
			BeanUtils.copyProperties(userBean, user);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return userBean;
	}
	
	/*
	 * Following methods convert Controller beans to persistence beans
	 */
	public static Login getLogin(LoginBean loginBean) {

		Login login = null;

		try {
			login = new Login();
			BeanUtils.copyProperties(login, loginBean);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

		return login;
	}

	public static Registration getRegistration(RegistrationBean registrationBean) {

		Registration registration = null;

		try {
			registration = new Registration();
			BeanUtils.copyProperties(registration, registrationBean);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return registration;
	}

	public static User getUser(UserBean userBean) {

		User user = null;

		try {
			user = new User();
			BeanUtils.copyProperties(user, userBean);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	
	/**
	 * Null or empty check
	 */
	
	public static boolean isEmptyOrNull(Object obj) {
		return (obj == null)?true:false;
	}
	
	public static boolean isEmptyOrNull(String strVal) {
		return (strVal == null || strVal.trim().length() == 1)?true:false;
	}
}
