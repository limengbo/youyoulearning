package com.lofter.youyoulearning.quxinyong.jsp.dao;

import java.util.List;
import java.util.Map;

import com.lofter.youyoulearning.quxinyong.jsp.entity.Board;

public interface BoardDao {
	public Map<String, List<Board>> findBoard();

	public Board findBoard(int id);//通过版块 ID 找到对应的主体信息
}
