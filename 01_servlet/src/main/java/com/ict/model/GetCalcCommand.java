package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCalcCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 일처리
		int s1 = Integer.parseInt(request.getParameter("s1"));
		int s2 = Integer.parseInt(request.getParameter("s2"));
		String op = request.getParameter("op");
		
		int result = 0;
		switch (op) {
		case "+": result = s1 + s2;break;
		case "-": result = s1 - s2;break;
		case "*": result = s1 * s2;break;
		case "/": result = s1 / s2;break;
			
		}
		
		request.setAttribute("s1", s1);
		request.setAttribute("s2", s2);
		request.setAttribute("op", op);
		request.setAttribute("result", result);
		
		return "view/result03.jsp";
	}

}
