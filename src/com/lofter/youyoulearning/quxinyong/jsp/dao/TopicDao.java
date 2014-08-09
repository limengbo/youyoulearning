package com.lofter.youyoulearning.quxinyong.jsp.dao;


import java.util.List;

import com.lofter.youyoulearning.quxinyong.jsp.entity.Topic;

public interface TopicDao {
	public Topic findTopic(int topicId);

	public int addTopic(Topic topic);

	public int deleteTopic(int topicId);

	public int updateTopic(Topic topic);

	public List findListTopic(int page, int boardId);
}
