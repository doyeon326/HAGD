package com.hagd.dao;
import java.util.List;

import com.hagd.vo.BoardVO;

public interface BoardDAO {
	public List<BoardVO> selectBoard(); //게시글 불러오기(/*idx, user_stat */
	public List<BoardVO> searchBoard(String search);
}
