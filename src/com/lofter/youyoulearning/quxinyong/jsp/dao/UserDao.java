package com.lofter.youyoulearning.quxinyong.jsp.dao;

import com.lofter.youyoulearning.quxinyong.jsp.entity.User;

public interface UserDao {
	public User findUser(String name);// 查找用户

	public int addUser(User user);// 增加用户

	public int updateUser(User user);// 修改用户

	public User findUser(int id);// 通过用户 ID ，找到对应的用户信息
}
