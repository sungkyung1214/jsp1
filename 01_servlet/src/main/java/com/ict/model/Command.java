package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
//인터페이스는 추상메서드, 상수 를 가질 수 있다
	
	public String exec(HttpServletRequest request, HttpServletResponse response);
	
	
	
}
