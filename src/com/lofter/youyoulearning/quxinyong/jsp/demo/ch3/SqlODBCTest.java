package com.lofter.youyoulearning.quxinyong.jsp.demo.ch3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.ResultSet;

public class SqlODBCTest {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from tb1_user where uname='abc'";
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:bbs", "sa", "123456");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			String t = null;
			while (rs.next()) {
				t = rs.getString("uname");
			}
			if (t != null)
				System.out.println(t);
			else
				System.out.println("找不到用户");
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
