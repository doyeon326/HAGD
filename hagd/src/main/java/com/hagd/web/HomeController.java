package com.hagd.web;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import com.mysql.cj.Session;


@Controller
public class HomeController {
	@Autowired
	private BoardServiceImpl service_board; 
	@Autowired
	private UsersServiceImpl service_user;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}
	@RequestMapping(value = "/loginCheck", method = RequestMethod.GET)
	public String loginCheck(String id, String pw, HttpSession session, HttpServletRequest request) {
		session.setAttribute("id", id);
		session.setAttribute("pw",pw);
		return "redirect:/afterLogin"; 
	}
	
	@RequestMapping(value = "/afterLogin", method = RequestMethod.GET)
	public String home(Locale locale, Model model,HttpSession session,HttpServletRequest request) {
		/*login check*/
		String pw = (String) session.getAttribute("pw");
		String id = (String) session.getAttribute("id");
		String loginStatus = service_user.checkPw(id, pw);
		request.setAttribute("loginStatus", loginStatus);
		
		/*get idx*/
		int idx = service_user.checkUserIdx(id); 
		/*set user idx in session*/
		session.setAttribute("idx",idx);
		
		String path = request.getServletPath();
		request.setAttribute("path", path);
		System.out.println(path);
		
		List<BoardVO> list = service_board.selectBoard(); 
		List<UsersVO> user = service_user.selectUsers(Integer.parseInt(session.getAttribute("idx").toString())); 
		/*get user stat*/
		String stat=null;
		if(user.get(0).getUser_status()==2) {
			stat = "Seller"; 
			List<BoardVO> sellerBoard = service_board.selectSellerBoard();
			List<BoardVO> hitlist = service_board.selectOrderByHit(); 
			model.addAttribute("hitlist",hitlist);
			model.addAttribute("stat",stat);
			model.addAttribute("user",user);
			model.addAttribute("board",sellerBoard);
			
			return "afterLogin";
		}
		else if(user.get(0).getUser_status()==0) {
			stat = "Seller";
			List<BoardVO> sellerBoard = service_board.selectSellerBoard();
			List<BoardVO> hitlist = service_board.selectOrderByHit(); 
			model.addAttribute("hitlist",hitlist);
			model.addAttribute("stat",stat);
			model.addAttribute("user",user);
			model.addAttribute("board",sellerBoard);
			return "afterLogin";
			
		}
		else if(user.get(0).getUser_status()==1) {
			stat = "Buyer";
			List<BoardVO> buyerBoard = service_board.selectBuyerBoard();
			List<BoardVO> hitlist = service_board.selectOrderByHit(); 
			model.addAttribute("hitlist",hitlist);
			model.addAttribute("stat",stat);
			model.addAttribute("user",user);
			model.addAttribute("board",buyerBoard);
			System.out.println("buyerslist");
			return "afterLogin";
			
		}
		
		
		List<BoardVO> hitlist = service_board.selectOrderByHit(); 
		model.addAttribute("hitlist",hitlist);
		
		model.addAttribute("user",user);
		model.addAttribute("board",list);
		System.out.println(user.get(0).getId());
		return "afterLogin";
	}
	
	@RequestMapping(value = "/history", method = RequestMethod.GET)
	public String history(Locale locale, Model model,HttpSession session) {
		List<BoardVO> list = service_board.selectUserHistory(Integer.parseInt(session.getAttribute("idx").toString()));
		model.addAttribute("userHistory",list);
		return "history";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@RequestParam(name="search") String search , Model model) {
		List<BoardVO> list = service_board.searchBoard(search);
		model.addAttribute("board",list); 
		list.get(0).getContent();
		return "afterLogin";
	}
	
	@RequestMapping(value = "/switchUserStat", method = RequestMethod.GET)
	public String switchUser(Locale locale, Model model, String stat,HttpSession session) {
		List<UsersVO> user = service_user.selectUsers(Integer.parseInt(session.getAttribute("idx").toString())); //string으로 값 받아와서 user id값 알아내야함 
		if("Seller".equals(stat)) {
			
			if(user.get(0).getUser_status()==2) {
				stat = "Buyer"; 
				List<BoardVO> buyerBoard = service_board.selectBuyerBoard();
				List<BoardVO> hitlist = service_board.selectOrderByHit(); 
				model.addAttribute("hitlist",hitlist);
				model.addAttribute("stat",stat);
				model.addAttribute("user",user);
				model.addAttribute("board",buyerBoard);
				return "afterLogin";
			}
			else {
				stat = "계정을 새로 만들어주세요";
				List<BoardVO> sellerBoard = service_board.selectSellerBoard();
				List<BoardVO> hitlist = service_board.selectOrderByHit(); 
				model.addAttribute("hitlist",hitlist);
				model.addAttribute("stat",stat);
				model.addAttribute("user",user);
				model.addAttribute("board",sellerBoard);
				return "afterLogin";
			} 
		}
		
		else if("Buyer".equals(stat)) {
			if(user.get(0).getUser_status()==2) {
				stat="Seller";
				List<BoardVO> sellerBoard = service_board.selectSellerBoard();
				List<BoardVO> hitlist = service_board.selectOrderByHit(); 
				model.addAttribute("hitlist",hitlist);
				model.addAttribute("stat",stat);
				model.addAttribute("user",user);
				model.addAttribute("board",sellerBoard);
				return "afterLogin";
			}
			else {
				stat = "계정을 새로 만들어주세요";
				List<BoardVO> buyerBoard = service_board.selectBuyerBoard();
				List<BoardVO> hitlist = service_board.selectOrderByHit(); 
				model.addAttribute("hitlist",hitlist);
				model.addAttribute("stat",stat);
				model.addAttribute("user",user);
				model.addAttribute("board",buyerBoard);
				return "afterLogin";
			} 
			
		}
		return "afterLogin";
	}
	
//	
//	public String switchUserStat() {
//		
//	}
}
