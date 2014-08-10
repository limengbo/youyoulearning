package com.lofter.youyoulearning.quxinyong.jsp.entity;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private String upass;
	private Integer gender;
	private String head;
	private Date regTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", upass=" + upass
				+ ", gender=" + gender + ", head=" + head + ", regTime="
				+ regTime + "]";
	}

}
