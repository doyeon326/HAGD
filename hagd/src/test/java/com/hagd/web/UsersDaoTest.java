package com.hagd.web;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hagd.dao.UsersDAO;
import com.hagd.vo.BoardVO;
import com.hagd.vo.UsersVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class UsersDaoTest {
		@Autowired
		private UsersDAO dao; 
		
		@Test
		public void testSelectAll() throws Exception{
		List<UsersVO>list = dao.selectUsers(1);
			for(UsersVO test: list) {
				System.out.println(test.getIdx() + test.getId());
			}
		
		}
}


