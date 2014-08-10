package com.lofter.youyoulearning.quxinyong.jsp.test;

import java.util.List;

import com.lofter.youyoulearning.quxinyong.jsp.dao.TopicDao;
import com.lofter.youyoulearning.quxinyong.jsp.dao.impl.TopicDaoImpl;
import com.lofter.youyoulearning.quxinyong.jsp.entity.Topic;

public class TopicDaoImplTest {
	public static void main(String[] args) {
		TopicDao topicDao = new TopicDaoImpl();
		List<Topic> listTopic = topicDao.findListTopic(1, 1);
		System.out.println("===========主题列表===========");
		for (int i = 0; i < listTopic.size(); i++) {
			Topic topic = listTopic.get(i);
			System.out.println(topic);
		}
	}
}
