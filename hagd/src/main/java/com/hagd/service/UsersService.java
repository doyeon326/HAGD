package com.hagd.service;

import java.util.List;

import com.hagd.vo.UsersVO;

public interface UsersService {
	public List<UsersVO> selectUsers(int idx);
	
}
