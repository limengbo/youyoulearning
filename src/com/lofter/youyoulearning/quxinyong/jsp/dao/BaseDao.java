package com.lofter.youyoulearning.quxinyong.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	public final static String DRIVER = "com.microsoft.jdbc.sqlserver.SQLServerDriver";// 驱动
	public final static String URL = "jdbc:microsoft:sqlserver://localhost:1433;DataBaseName=bbs";
	public final static String DBNAME = "sa";// 数据用户账号
	public final static String DBPASS = "123456";// 数据用户密码

	public Connection getConn() {// 数据库链接
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, DBNAME, DBPASS);
		} catch (ClassNotFoundException e) {
			System.out.println("注册驱动异常");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("连接数据库异常");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 关闭资源
	 * 
	 * @param conn
	 * @param pstmt
	 * @param rs
	 */
	public void closeAll(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("RS关闭发生异常");
				e.printStackTrace();
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("pstmt 关闭发生异常");
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("conn 关闭发生异常");
				e.printStackTrace();
			}
		}
	}

	public int executeSQL(String sql, String[] getValue) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConn();// 获取数据库连接方法
			pstmt = conn.prepareStatement(sql);
			if (getValue != null && getValue.length > 0) {
				for (int i = 0; i < getValue.length; i++) {
					pstmt.setString(i + 1, getValue[i]);
				}
			}
			result = pstmt.executeUpdate();// 执行 SQL 语句
		} catch (Exception e) {
			System.out.println("executeSQL 方法异常");
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * 
	 * @param obj
	 */
	public void test(Object... obj) {

	}
}
