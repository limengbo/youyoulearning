package com.lofter.youyoulearning.quxinyong.jsp.test;

import java.util.List;
import java.util.Map;

import com.lofter.youyoulearning.quxinyong.jsp.dao.BoardDao;
import com.lofter.youyoulearning.quxinyong.jsp.dao.impl.BoardDaoImpl;
import com.lofter.youyoulearning.quxinyong.jsp.entity.Board;

public class BoardDaoImplTest {
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDaoImpl();
		Map<String, List<Board>> map = boardDao.findBoard();
		List<Board> listBoard = map.get("0");
		System.out.println("==========主板块的信息===========");
		for (Board board : listBoard) {
			System.out.println(board);
			List<Board> listSubBoard = map.get(board.getId() + "");
			System.out.println("==========子版块的信息（对应的主版块ID：" + board.getId()
					+ "）===========");
			for (Board board2 : listSubBoard) {
				
				System.out.println(board2);
				
			}
		}

	}
}
