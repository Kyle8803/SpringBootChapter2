package com.example.demo;

import org.springframework.boot.SpringApplication;

//@ComponentScan(basePackages = {"com.springboot.chapter3.*"})
public class SpringBootChapter2Application
{
	public static void main(String[] args) 
	{
		//2-8 Spring Boot运行文件SpringBootChapter2Application
		//以SpringBootChapter2Configuration.class作为配置类来运行Spring Boot项目
		//SpringApplication.run(SpringBootChapter2Configuration.class, args);
		SpringApplication springApplication = new SpringApplication(SpringBootChapter2Configuration.class);
		springApplication.run(args);
	}
}
