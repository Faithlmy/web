package com.lmy1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lmy2.Send;

public class myservlet1 extends HttpServlet {

	public myservlet1() {
		super();
	}


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().println("hello=9lmy " + new java.util.Date().toString());

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);

	}


	public void init() throws ServletException {
		// Put your code here
		//初始化一些数据库等
		System.out.println("myservlet1 的init 被调用");
		
		//创建一个线程
		Send send = new Send();
		send.start();
	}

}
