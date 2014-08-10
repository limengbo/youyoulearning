package com.lofter.youyoulearning.quxinyong.jsp.dao;


import java.util.List;

import com.lofter.youyoulearning.quxinyong.jsp.entity.Topic;

public interface TopicDao {
	public Topic findTopic(int topicId);//查找主题

	public int addTopic(Topic topic);//增加主题

	public int deleteTopic(int topicId);//删除主题

	public int updateTopic(Topic topic);//修改主题

	public List findListTopic(int page, int boardId);//查询主题列表
	public int findCountTopic(int boardId);//根据版块ID 查找对应的主题数
}
