package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex12_2")
public class Ex12_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 오늘 운세 구하기
		
		// 랜덤 구하는 방법
		// math.landom은 더블이다. 그래서 인트로 만들어줘야함
		int lucky = (int)(Math.random()*100)+1;
		
		out.println("<h2>Ex12_2 페이지(운세구하기)</h2>");
		out.println("<h2>오늘의 운세 : "+lucky+"</h2>");
		
	}

}
