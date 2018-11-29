package com.yun.service
		;

import com.yun.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;

	public boolean loginIn(String name,String password){
		String login = loginDao.getLogin();
		System.out.println(login);
		System.out.println(" login in success");
		return true;
	}

	public void loginOut(){
		System.out.println("login out success");
	}
}
