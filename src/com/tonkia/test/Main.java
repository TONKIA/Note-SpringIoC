package com.tonkia.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tonkia.service.UserService;

public class Main {

	public static void main(String[] args) {
		// 创建IoC容器
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从容器中获取Bean
		UserService us = ac.getBean("userService", UserService.class);
		// UserService us = (UserService) ac.getBean("userService");

		int id = 1;
		String name = us.getNameById(id);
		System.out.println(us.isExist("zhangsan"));
		System.out.println(us.getAgeByName("lisi"));
		System.out.println(name);
		// 关闭容器
		ac.close();
	}

}
