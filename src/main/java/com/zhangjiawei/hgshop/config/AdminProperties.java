package com.zhangjiawei.hgshop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/***
 * 
 * @author 26723
 *
 */
@Configuration
@PropertySource("classpath:hdshop-admin.properties")
public class AdminProperties {
	
	@Value("${amdin.name}")
	String adminName;
	
	@Value("${admin.pwd}")
	String password;

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
