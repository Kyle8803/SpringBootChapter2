package com.spring.chapter3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.spring.chapter3.pojo.User;

//代码清单3-3 定义Java配置文件
//代码清单3-6 加入注解@ComponentScan
@Configuration//代表这是一个Java配置文件
@ComponentScan(basePackages = "com.spring.chapter3.*")
//@ComponentScan(basePackages = {"com.spring.chapter3.pojo"})
//@ComponentScan(basePackageClasses={User.class})
public class AppConfig 
{
	public User initUser()
	{
		User user = new User();
		user.setId(1L);
		user.setUserName("user_name_1");
		user.setNote("note_1");
		return user;
	}
}
