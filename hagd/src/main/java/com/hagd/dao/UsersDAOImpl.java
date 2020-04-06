package com.hagd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.hagd.vo.UsersVO;

public class UsersDAOImpl implements UsersDAO {
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<UsersVO> selectUsers(int idx) {
		List<UsersVO> vo = sqlSession.selectList("com.hagd.mapper.UsersMapper.selectUser",idx);
		return vo;
	}

}
