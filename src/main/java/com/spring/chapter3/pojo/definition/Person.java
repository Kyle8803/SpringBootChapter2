package com.spring.chapter3.pojo.definition;
//代码清单3-13 定义人类和动物接口
public interface Person 
{
	//使用动物服务
	public void service();
	
	//设置动物
	public void setAnimal(Animal animal);
}
