package com.spring.chapter3.pojo;

import org.springframework.stereotype.Component;

import com.spring.chapter3.pojo.definition.Animal;
//代码清单3-14 两个实现类
@Component(value = "dog")
public class Dog implements Animal
{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Dog " + Dog.class.getSimpleName() + "是人类的朋友.");
	}
	
}
