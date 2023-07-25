package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex13_1")
public class Ex13_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 일처리를 구별하기 위해서 cmd 파라미터를 먼저 받자
		String cmd = request.getParameter("cmd");
		switch (cmd) {
		case "1":
			//오늘 날짜 구하기
			Calendar now = Calendar.getInstance();
			int year = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH)+1;
			int day = now.get(Calendar.DATE);
			
			out.println("<h2>Ex12_1 페이지(오늘날짜구하기)</h2>");
			out.println("<h2>"+year+". "+month+". "+ "."+ day+"."+ "</h2>");
			
			break;
		case "2":
			// 랜덤 구하는 방법
			// math.landom은 더블이다. 그래서 인트로 만들어줘야함
			int lucky = (int)(Math.random()*100)+1;
			
			out.println("<h2>Ex12_2 페이지(운세구하기)</h2>");
			out.println("<h2>오늘의 운세 : "+lucky+"</h2>");
			
			break;
		case "3":
			// 계산 결과 보기
			// 파라미터값이 존재함
			int s1 = Integer.parseInt(request.getParameter("s1"));
			int s2 = Integer.parseInt(request.getParameter("s2"));
			String op = request.getParameter("op");
			//이렇게 스위치 문 안에 들어있어도 상관은 없다~ (전역변수로 안 빼도 된다는말인듯 나혼자 이해하기에)
			
			int result = 0;
			switch (op) {
			case "+": result = s1 + s2;break;
			case "-": result = s1 - s2;break;
			case "*": result = s1 * s2;break;
			case "/": result = s1 / s2;break;
				
			}
			out.println("<h2>"+s1+op+s2+"="+ result+"</h2>");
			
			
			break;
		
		}
		
	}

}
