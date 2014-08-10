package com.lofter.youyoulearning.quxinyong.jsp.entity;

import java.util.Date;

public class Tip {
	private Integer id;
	private String title;
	private String content;
	private Date publishTime;
	private Date modifyTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Override
	public String toString() {
		return "Tip [id=" + id + ", title=" + title + ", content=" + content
				+ ", publishTime=" + publishTime + ", modifyTime=" + modifyTime
				+ "]";
	}

}
