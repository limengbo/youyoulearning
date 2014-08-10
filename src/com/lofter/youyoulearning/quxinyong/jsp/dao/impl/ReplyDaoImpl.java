package com.lofter.youyoulearning.quxinyong.jsp.dao.impl;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.lofter.youyoulearning.quxinyong.jsp.dao.ReplyDao;
import com.lofter.youyoulearning.quxinyong.jsp.entity.Reply;

public class ReplyDaoImpl implements ReplyDao {

	@Override
	public int addReply(Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delectReply(int ReplyId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateReply(Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Reply> findListReply(int page, int TopicId) {
		List<Reply> list = new LinkedList();
		for (int i = 0; i < 10; i++) {
			Reply reply = new Reply();
			reply.setTopicId(i + 1);
			reply.setTitle("回复：" + i + "标题");
			reply.setContent("回复：" + i + "内容");
			reply.setPublishTime(new Date());
			reply.setReplyId(i);
			list.add(reply);
		}
		return list;
	}
}
