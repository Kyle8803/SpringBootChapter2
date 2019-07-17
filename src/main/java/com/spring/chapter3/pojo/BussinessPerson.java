package com.spring.chapter3.pojo;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.spring.chapter3.pojo.definition.Animal;
import com.spring.chapter3.pojo.definition.Person;
//代码清单3-14 两个实现类
@Component(value="bussinessPerson")
public class BussinessPerson implements Person, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
                                                InitializingBean, DisposableBean
{
	private Animal animal = null;
	
	//代码清单3-16 带有参数的构造方法
	public BussinessPerson(@Autowired @Qualifier("dog") Animal animal)
	{
		this.animal = animal;
	}
	
	@Override
	public void service() 
	{
		// TODO Auto-generated method stub
		this.animal.use();
	}

	@Override
	public void setAnimal(Animal animal)
	{
		// TODO Auto-generated method stub
		this.animal = animal;
	}
	
	@Override
	public void setBeanName(String name) 
	{
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println(this.getClass().getSimpleName() +
				"调用BeanNameAware的setBeanName");
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException 
	{
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + 
				"调用BeanFactoryAware的setBeanFactory.");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException
	{
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + 
				"调用ApplicationContextAware的setApplicationContext");
	}
	
	//自定义初始化方法
	@PostConstruct
	public void init()
	{
		System.out.println(this.getClass().getSimpleName() +
				"注解@PostConstruct定义的自定义初始化方法");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception 
	{
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() +
				"调用InitializingBean的afterPropertiesSet方法");
		System.out.println("");
	}
	
	
	@Override
	public void destroy() throws Exception
	{
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() +
				"调用DisposableBean的destroy方法");
	}
	
	
	
}
