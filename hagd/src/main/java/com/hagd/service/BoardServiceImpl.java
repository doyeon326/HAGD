package com.hagd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hagd.dao.BoardDAO;
import com.hagd.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardDAO {
	
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
}
