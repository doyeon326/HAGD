package com.hagd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.hagd.vo.BoardVO;

public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSession sqlSession; 
	
	@Override
	public List<BoardVO> selectBoard() {
		List<BoardVO> vo = sqlSession.selectList("com.hagd.mapper.BoardMapper.selectAll");
		System.out.println("DAO���� ���ޱ� ����");
		return vo;
	}
	@Override
	public List<BoardVO> searchBoard(String search){
		List<BoardVO> vo = sqlSession.selectList("com.hagd.mapper.BoardMapper.searchAll",search);
		System.out.println("search ����");
		return vo; 
	}
}
