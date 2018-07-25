package com.tonkia.service;

public interface UserService {
	public String getNameById(int id);

	public boolean isExist(String name);

	public int getAgeByName(String name);
}
