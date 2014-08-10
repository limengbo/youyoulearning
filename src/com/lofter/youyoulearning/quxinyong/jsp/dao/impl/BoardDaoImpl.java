package com.lofter.youyoulearning.quxinyong.jsp.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lofter.youyoulearning.quxinyong.jsp.dao.BoardDao;
import com.lofter.youyoulearning.quxinyong.jsp.entity.Board;

public class BoardDaoImpl implements BoardDao {

	@Override
	public Map<String, List<Board>> findBoard() {
		Map<String, List<Board>> map = new HashMap<String, List<Board>>();
		List<Board> listBoard = new ArrayList<Board>();// 保存主版块的对象
		List<Board> listSubBoard1 = new ArrayList<Board>();// 保存子版块的对象
		List<Board> listSubBoard2 = new ArrayList<Board>();// 保存子版块的对象

		for (int i = 1; i < 2; i++) {
			Board board = new Board();
			board.setId(i);
			board.setTitle("主版块： " + i);
			board.setParentId(0);
			listBoard.add(board);
		}
		map.put("0", listBoard);
		for (int i = 1; i < 3; i++) {
			Board board = new Board();
			board.setId(i + 1);
			board.setTitle("主版块为1的子版块ID是 " + i);
			board.setParentId(1);
			listSubBoard1.add(board);
		}
		map.put("1", listSubBoard1);
		for (int i = 1; i < 3; i++) {
			Board board = new Board();
			board.setId(i + 8);
			board.setTitle("主版块为2的子版块ID是 " + i);
			board.setParentId(2);
			listSubBoard1.add(board);
		}
		map.put("2", listSubBoard2);
		return map;
	}

	@Override
	public Board findBoard(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
