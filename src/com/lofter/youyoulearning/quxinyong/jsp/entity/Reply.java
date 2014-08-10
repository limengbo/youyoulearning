package com.lofter.youyoulearning.quxinyong.jsp.entity;

import java.util.Date;

public class Reply {
	private String title;
	private String content;
	private Date publishTime;
	private Integer replyId;
	private Integer topicId;

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

	public Integer getReplyId() {
		return replyId;
	}

	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}

	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	@Override
	public String toString() {
		return "Reply [title=" + title + ", content=" + content
				+ ", publishTime=" + publishTime + ", replyId=" + replyId
				+ ", topicId=" + topicId + "]";
	}

}
