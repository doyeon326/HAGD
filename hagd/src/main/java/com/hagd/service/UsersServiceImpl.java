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

}
