package com.app.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDaoImpl extends DAO<UserDaoImpl> {
	Connection c;
	public UserDaoImpl(Connection conn) {
	
		super(conn);
		c = conn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(UserDaoImpl obj) {
		// TODO Auto-generated method stub
		String requette;
		requette = " inster request";
		System.out.println(requette);
		try {
			java.sql.Statement stat = c.createStatement();
			stat.execute(requette);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean delete(UserDaoImpl obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(UserDaoImpl obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDaoImpl find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
			
	}
