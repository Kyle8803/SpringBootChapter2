package com.spring.chapter3.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.spring.chapter3.pojo.definition.Animal;
//代码清单3-15 猫类
@Component(value="cat")
@Primary
public class Cat implements Animal 
{
	@Override
	public void use() 
	{
		// TODO Auto-generated method stub
		System.out.println(Cat.class.getSimpleName() + "抓老鼠");
	}	
}
