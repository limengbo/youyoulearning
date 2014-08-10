package com.lofter.youyoulearning.quxinyong.jsp.dao;

import java.util.Map;

import com.lofter.youyoulearning.quxinyong.jsp.entity.Board;

public interface BoardDao {
	public Map<String,Board> findBoard();
}
