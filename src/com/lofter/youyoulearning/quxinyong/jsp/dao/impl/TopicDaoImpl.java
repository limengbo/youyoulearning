package com.lofter.youyoulearning.quxinyong.jsp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.lofter.youyoulearning.quxinyong.jsp.dao.TopicDao;
import com.lofter.youyoulearning.quxinyong.jsp.entity.Topic;

public class TopicDaoImpl implements TopicDao {

	public Topic findTopic(int topicId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int addTopic(Topic topic) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteTopic(int topicId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateTopic(Topic topic) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List findListTopic(int page, int boardId) {
		List list = new ArrayList();
		for (int i = 0; i < 20; i++) {
			Topic topic=new Topic();
			topic.setTopicId(i+1);
		}
		return list;
	}

}
