package com.lofter.youyoulearning.quxinyong.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoJDBC {
	public static void main(String[] args) {
		odbcConnection();
		/*sqlServerConnection();
		mysqlConnection();*/
	}

	/**
	 * 建立 和MySQL 数据库之间的连接
	 */
	private static void mysqlConnection() {
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username,
					password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 建立 和SQLServer 数据库之间的连接
	 */
	private static void sqlServerConnection() {
		String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=bbs";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(url, "sa", "sa");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void odbcConnection() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDrive");
			Connection con = DriverManager.getConnection("jdbc:odbc:bbs", "sa",
					"123456");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
