package com.hagd.web;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hagd.service.BoardServiceImpl;
import com.hagd.service.UsersServiceImpl;
import com.hagd.vo.BoardVO;
import com.hagd.vo.UsersVO;


@Controller
public class HomeController {
	@Autowired
	private BoardServiceImpl service_board; 
	@Autowired
	private UsersServiceImpl service_user;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<BoardVO> list = service_board.selectBoard(); 
		List<UsersVO> user = service_user.selectUsers(2); 
		/*get user stat*/
		String stat=null;
		if(user.get(0).getSeller()==1&&user.get(0).getBuyer()==1) {
			stat = "Seller"; 
			model.addAttribute("stat",stat);
			model.addAttribute("user",user);
			model.addAttribute("board",list);
			return "sellerLogin";
		}
		else if(user.get(0).getSeller()==1&&user.get(0).getBuyer()==0) {
			stat = "Seller";
			model.addAttribute("stat",stat);
			model.addAttribute("user",user);
			model.addAttribute("board",list);
			return "sellerLogin";
			
		}
		else if(user.get(0).getSeller()==0&&user.get(0).getBuyer()==1) {
			stat = "buyer";
			model.addAttribute("stat",stat);
			model.addAttribute("user",user);
			model.addAttribute("board",list);
			return "buyerLogin";
		}
		
		
		
		
		model.addAttribute("user",user);
		model.addAttribute("board",list);
		System.out.println(user.get(0).getId());
		return "sellerLogin";
	}
	
	@RequestMapping(value = "/history", method = RequestMethod.GET)
	public String history(Locale locale, Model model) {
		
		return "history";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@RequestParam(name="search") String search , Model model) {
		List<BoardVO> list = service_board.searchBoard(search);
		model.addAttribute("board",list); 
		
		return "sellerLogin";
	}
	
}
