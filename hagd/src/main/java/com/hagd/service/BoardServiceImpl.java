package com.hagd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hagd.dao.BoardDAO;
import com.hagd.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDAO dao; 
	
	@Override
	public List<BoardVO> selectBoard() {	
		BoardVO vo = new BoardVO();
		return dao.selectBoard();
	}
	
	@Override
	public List<BoardVO> searchBoard(String search){
		BoardVO vo = new BoardVO(); 
		return dao.searchBoard(search);
	}
	@Override
	public List<BoardVO> selectBuyerBoard(){ //when login to in seller's account which means to show buyer's board 
		BoardVO vo = new BoardVO();
		return dao.selectBuyerBoard();
	}
	@Override
	public List<BoardVO> selectSellerBoard(){
		BoardVO vo = new BoardVO();
		return dao.selectSellerBoard();
	}
	
	@Override
	public List<BoardVO> selectOrderByHit(){
		BoardVO vo = new BoardVO();
		return dao.selectOrderByHit();
	}
	
	@Override
	public List<BoardVO> selectUserHistory(int idx){
		BoardVO vo = new BoardVO();
		return dao.selectUserHistory(idx);
	}
	
	
}
