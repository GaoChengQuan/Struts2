package com.situ.struts.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.situ.struts.dao.IAdminDao;
import com.situ.struts.pojo.Admin;
import com.situ.struts.util.JdbcUtil;

public class AdminDaoImpl implements IAdminDao {

	@Override
	public Admin login(Admin admin) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = JdbcUtil.getConnection();
			String sql = "SELECT id,NAME,PASSWORD FROM admin WHERE NAME=? AND PASSWORD=?;";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, admin.getName());
			preparedStatement.setString(2, admin.getPassword());
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String adminName = resultSet.getString("name");
				String adminPassword = resultSet.getString("password");
				return new Admin(id, adminName, adminPassword);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, preparedStatement, resultSet);
		}

		return null;
	}

}
