package com.hagd.service;

import java.util.List;

import com.hagd.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> selectBoard();
	public List<BoardVO> searchBoard(String search);
	public List<BoardVO> selectBuyerBoard();
	public List<BoardVO> selectSellerBoard();
	public List<BoardVO> selectOrderByHit();
	public List<BoardVO> selectUserHistory(int idx);
}
