package com.lofter.youyoulearning.quxinyong.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoJDBC {
	public static void main(String[] args) {
		/* demo1(); */
		String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=bbs";
		try {
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			Connection con = DriverManager.getConnection(url, "sa", "sa");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void demo1() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDrive");
			Connection con = DriverManager.getConnection("jdbc:odbc:bbs", "sa",
					"sa");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
