package com.lofter.youyoulearning.quxinyong.jsp.test;

import java.util.List;

import com.lofter.youyoulearning.quxinyong.jsp.dao.ReplyDao;
import com.lofter.youyoulearning.quxinyong.jsp.dao.impl.ReplyDaoImpl;
import com.lofter.youyoulearning.quxinyong.jsp.entity.Reply;

public class ReplyDaoImplTest {
	public static void main(String[] args) {
		ReplyDao replyDao = new ReplyDaoImpl();
		List<Reply> replyList = replyDao.findListReply(1, 1);
		System.out.println("=========回复信息===========");
		for (int i = 0; i < replyList.size(); i++) {
			Reply reply = replyList.get(i);
			System.out.println(reply);
		}
	}
}
