package com.tonkia.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.tonkia.dao.UserDao;

public class UserDaoImpl implements UserDao {
	private DataSource ds;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public String getNameById(int id) {
		String name = "";
		try {
			Connection conn = ds.getConnection();
			ResultSet rs = conn.createStatement().executeQuery("select *from test where id =" + id);
			while (rs.next()) {
				name = rs.getString(rs.findColumn("name"));
			}
			rs.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}

}
