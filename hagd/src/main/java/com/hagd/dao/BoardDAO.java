package com.hagd.dao;
import java.util.List;

import com.hagd.vo.BoardVO;

public interface BoardDAO {
	public List<BoardVO> selectBoard(); //�Խñ� �ҷ�����(/*idx, user_stat */
	public List<BoardVO> searchBoard(String search);
	public List<BoardVO> selectBuyerBoard(); //shows only seller's board
	public List<BoardVO> selectSellerBoard();
	public List<BoardVO> selectOrderByHit();
	public List<BoardVO> selectUserHistory(int idx); //TODO
}
