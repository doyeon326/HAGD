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
	
	@Override
	public String checkPw(String id,String pw) {
		System.out.println(id + pw);
		String checkpw = sqlSession.selectOne("com.hagd.mapper.UsersMapper.selectPw",id);
		System.out.println(checkpw);
		if(checkpw!=null) {
			if(checkpw.equals(pw) ) {
				return "SUCCESS";
			}
			else return "FAIL"; 
		}
		else return "FAIL";
		}
	@Override
	public int checkUserIdx(String id) {
		int idx = sqlSession.selectOne("com.hagd.mapper.UsersMapper.selectIdx",id);
		return idx;
	}

}
