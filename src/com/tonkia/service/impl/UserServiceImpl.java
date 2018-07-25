package com.tonkia.service.impl;

import java.util.Map;
import java.util.Set;

import com.tonkia.dao.UserDao;
import com.tonkia.service.UserService;

public class UserServiceImpl implements UserService {
	private int age;
	private Set<String> list;
	private Map<String, Integer> map;
	private UserDao ud;

	public void setUd(UserDao ud) {
		this.ud = ud;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public void setList(Set<String> list) {
		this.list = list;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UserServiceImpl() {

	}

	public UserServiceImpl(int age) {
		this.age = age;
	}

	public String getNameById(int id) {
		return ud.getNameById(id);
	}

	@Override
	public boolean isExist(String name) {
		if (list == null || name == null) {
			return false;
		}
		return list.contains(name);
	}

	@Override
	public int getAgeByName(String name) {
		if (map != null && name != null) {
			return map.get(name);
		}
		return 0;
	}
}
