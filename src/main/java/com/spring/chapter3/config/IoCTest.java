package com.spring.chapter3.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.chapter3.pojo.BussinessPerson;
import com.spring.chapter3.pojo.User;
import com.spring.chapter3.pojo.definition.Person;
import com.spring.chapter3.scope.pojo.ScopeBean;

//代码清单3-4 使用AnnotationConfigApplicationContext
public class IoCTest 
{
	public static void main(String[] args) 
	{
		//private static Logger = Logger.getLogger(IoCTest.class);
		// TODO Auto-generated method stub
		//将Java配置文件AppConfig.class传递给AnnotationConfigApplicationContext的构造方法，
		//这样它就能读取配置了。然后将配置里面的Bean装配到IoC容器中，于是可以使用getBean方法获取对应的POJO.
		AnnotationConfigApplicationContext applicationContext 
		                        = new AnnotationConfigApplicationContext(AppConfig.class);
		/*
		User user = applicationContext.getBean(User.class);
		
		Person person = applicationContext.getBean(BussinessPerson.class);
		person.service();
		
		System.out.println(user.getId());
		applicationContext.close();
		*/
		ScopeBean scopeBean1 = applicationContext.getBean(ScopeBean.class);
		ScopeBean scopeBean2 = applicationContext.getBean(ScopeBean.class);
		System.out.println(scopeBean1 == scopeBean2);
		applicationContext.close();
	}
}
