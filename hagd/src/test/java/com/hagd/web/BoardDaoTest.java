package com.hagd.web;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hagd.dao.BoardDAO;
import com.hagd.vo.BoardVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDaoTest {
		@Autowired
		private BoardDAO dao; 
		
		@Test
		public void testSelectAll() throws Exception{
		List<BoardVO>list = dao.selectAll();
			for(BoardVO test: list) {
				System.out.println(test.getIdx() + test.getContent());
			}
		
		}
}
