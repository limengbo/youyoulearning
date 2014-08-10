package com.lofter.youyoulearning.quxinyong.jsp.dao;

import java.util.List;

import com.lofter.youyoulearning.quxinyong.jsp.entity.Reply;

public interface ReplyDao {
	public int addReply(Reply reply);// 增加回复

	public int delectReply(int ReplyId);// 删除回复

	public int updateReply(Reply reply);// 修改回复

	public List<Reply> findListReply(int page, int TopicId);// 根据某主题显示第几页的列表
}
