package com.spring.chapter3.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//代码清单3-2
//代码清单3-5 加入注解@Component
@Component(value="user")//@Component表明这个类将被Spring IoC容器扫描装配，配置的"user"则是作为Bean的名称
public class User
{
	@Value("2")//注解@Value则是指定具体的值，使得Spring IoC给予对应的属性注入对应的值。
	private   Long id;
	
	@Value("user_name_1")
	private String userName;
	
	@Value("note_1")
	private String note;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
