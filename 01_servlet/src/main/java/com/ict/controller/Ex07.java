package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex07")
public class Ex07 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 요청에 대한 한글처리
        request.setCharacterEncoding("utf-8");
        // 응답에 대한 한글 처리
        response.setContentType("text/html; charset=utf-8");
        // 출력을 위해서
        PrintWriter out = response.getWriter();

        try {
            String s1 = request.getParameter("s1");
            String s2 = request.getParameter("s2");
            String op = request.getParameter("op");
//            int y1 = Integer.parseInt(request.getParameter("s1"));
            // 이렇게 한번에 받아서도 처리 가능
            int k1 = Integer.parseInt(s1);
            int k2 = Integer.parseInt(s2);
            int result = 0;
            switch (op) {
            case "+": result = k1 + k2; break;
            case "-": result = k1 - k2; break;
            case "": result = k1 *k2; break;
            case "/": result = k1 / k2; break;
            }
            out.print("<h2>결과 : " + k1 + op + k2 + " = " + result + "입니다.</h2>");
        } catch (Exception e) {
            out.print("<h2> 결과: 0으로는 나눌 수가 없습니다.</h2>");
        }
    }

}