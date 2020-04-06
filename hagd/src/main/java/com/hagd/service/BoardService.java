package com.hagd.service;

import java.util.List;

import com.hagd.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> selectBoard();
	public List<BoardVO> searchBoard(String search);
}
