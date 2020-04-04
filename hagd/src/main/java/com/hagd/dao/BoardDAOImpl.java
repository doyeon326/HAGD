package com.hagd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.hagd.vo.BoardVO;

public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSession sqlSession; 
	
	@Override
	public List<BoardVO> selectAll() {
		List<BoardVO> vo = sqlSession.selectList("com.hagd.mapper.BoardMapper.selectAll");
		System.out.println("DAO에서 값받기 성공");
		return vo;
	}

}
