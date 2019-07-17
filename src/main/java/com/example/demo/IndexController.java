package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//2.4开发自己的Spring Boot项目
//代码清单2-6 开发控制器
@Controller
public class IndexController 
{
	@RequestMapping(value="/index")//这里定义了一个映射为/index的路径
	public String index()
	{
		return "index";//方法返回"index",与application.properties里配置的前缀和后缀结合起来找对应的jsp文件,
		               //为此还需要开发一个对应的jsp文件：建一个/webapp/WEB-INF/jsp/index.jsp文件
	}
	
	@RequestMapping(value="/test")
	@ResponseBody
	public Map<String,String> test()
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("key", "value");
		return map;
	}
}
