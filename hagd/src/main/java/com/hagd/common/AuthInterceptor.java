package com.hagd.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession(false);
		if(session != null) {
			Object id = session.getAttribute("id");
			if(id != null) {
				return true;
			}
		}
		if(request.getParameter("id")!=null) {
			return true;
		}
		System.out.println("인터셉터에 의해 경로 설정 : /");
		response.sendRedirect(request.getContextPath() + "/");
		return false; // true;
	}
	
}
