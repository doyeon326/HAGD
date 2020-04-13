package com.hagd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hagd.dao.UsersDAO;
import com.hagd.vo.UsersVO;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersDAO dao; 
	
	@Override
	public List<UsersVO> selectUsers(int idx) {
		return dao.selectUsers(idx);
	}
	@Override
	public String checkPw(String id,String pw) {
		return dao.checkPw(id, pw); 
	}
	@Override
	public int checkUserIdx(String id) {
		return dao.checkUserIdx(id);
	}
}
