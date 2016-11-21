package com.shopeasy.services.impls;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shopeasy.daos.ShopEasyDao;
import com.shopeasy.persistences.beans.LoginBean;
import com.shopeasy.persistences.beans.RegistrationBean;
import com.shopeasy.persistences.beans.UserBean;
import com.shopeasy.services.ShopEasyService;

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
	public Integer registerMobileNumber(RegistrationBean registrationBean) {
		return shopEasyDao.registerMobileNumber(registrationBean);
	}

	@Override
	public boolean signup(UserBean userBean) {
		return shopEasyDao.signup(userBean);
	}

}
