package com.lofter.youyoulearning.quxinyong.jsp.entity;

import java.util.Date;

public class Topic {
	private Integer topicId;
	private String title;
	private String Content;
	private Date publishTime;
	private Integer boardId;
	private Integer userId;

	public Topic() {
		super();
	}

	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Integer getBoardId() {
		return boardId;
	}

	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", title=" + title + ", Content="
				+ Content + ", publishTime=" + publishTime + ", boardId="
				+ boardId + ", userId=" + userId + "]";
	}

}
