package com.shopeasy.services.impls;

import org.springframework.beans.factory.annotation.Autowired;

import com.shopeasy.daos.ShopEasyDao;
import com.shopeasy.persistences.beans.LoginBean;
import com.shopeasy.persistences.beans.RegistrationBean;
import com.shopeasy.persistences.beans.UserBean;
import com.shopeasy.services.ShopEasyService;

public class ShopEasyServiceImpl implements ShopEasyService {

	@Autowired
	private ShopEasyDao shopEasyDao;
	
	@Override
	public UserBean login(LoginBean loginBean) {
		return shopEasyDao.login(loginBean);
	}

	@Override
	public Integer registerMobileNumber(RegistrationBean registrationBean) {
		return shopEasyDao.registerMobileNumber(registrationBean);
	}

	@Override
	public boolean signup(UserBean userBean) {
		return shopEasyDao.signup(userBean);
	}

}
