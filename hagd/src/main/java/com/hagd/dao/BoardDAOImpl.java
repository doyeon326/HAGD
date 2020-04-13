package com.hagd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hagd.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSession sqlSession; 
	
	@Override
	public List<BoardVO> selectBoard() {
		List<BoardVO> vo = sqlSession.selectList("com.hagd.mapper.BoardMapper.selectAll");
		System.out.println("DAO done");
		return vo;
	}
	@Override
	public List<BoardVO> searchBoard(String search){
		List<BoardVO> vo = sqlSession.selectList("com.hagd.mapper.BoardMapper.searchAll",search);
		System.out.println("search done");
		return vo; 
	}
	

   @Override
	public List<BoardVO> selectBuyerBoard(){
		
		List<BoardVO> vo = sqlSession.selectList("com.hagd.mapper.BoardMapper.selectBuyersBoard");
		System.out.println("getting buyer's board which means only seller's board");
		return vo;
		
	} //need to update db like the user stat should be just one column.
   @Override
   public List<BoardVO> selectSellerBoard(){
	   List<BoardVO> vo = sqlSession.selectList("com.hagd.mapper.BoardMapper.selectSellersBoard");
	   System.out.println("getting seller's board which means showing list that buyer wrote");
	   return vo;
   }
  	@Override
  	public List<BoardVO> selectOrderByHit(){
	  List<BoardVO> vo = sqlSession.selectList("com.hagd.mapper.BoardMapper.selectBoardOrderByHit");
	  return vo; 
  		
  	}
	@Override
	public List<BoardVO> selectUserHistory(int idx) {
		  List<BoardVO> vo = sqlSession.selectList("com.hagd.mapper.BoardMapper.selectUserHistory",idx);
		  return vo;
	  	
	}
	
  	
	
}
