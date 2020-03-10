package com.zhangjiawei.hgshop.servcie.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhangjiawei.hgshop.config.AdminProperties;
import com.zhangjiawei.hgshop.service.UserService;



/***
 * 
 * @author 26723
 *
 */
@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	AdminProperties adminPro;

	@Override
	public boolean login(String userName, String passWord) {
		
		// TODO Auto-generated method stub
		
		return (adminPro.getAdminName().equals(userName) 
				&& adminPro.getPassword().equals(passWord));
		
		
	}

}
