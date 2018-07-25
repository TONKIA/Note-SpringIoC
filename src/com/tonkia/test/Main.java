package com.tonkia.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tonkia.service.UserService;

public class Main {

	public static void main(String[] args) {
		// ����IoC����
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// �������л�ȡBean
		UserService us = ac.getBean("userService", UserService.class);
		// UserService us = (UserService) ac.getBean("userService");

		int id = 1;
		String name = us.getNameById(id);
		System.out.println(us.isExist("zhangsan"));
		System.out.println(us.getAgeByName("lisi"));
		System.out.println(name);
		// �ر�����
		ac.close();
	}

}
