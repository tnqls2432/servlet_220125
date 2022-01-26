package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz10")
public class PostMethodQuiz10 extends HttpServlet {
	private final Map<String, String> userMap =  new HashMap<String, String>() {
		{
			put("id", "marobiana");
			put("password", "qwerty1234");
			put("name", "신보람");
		}
	};
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>결과</title></head><body>");
		if(userMap.get("userId").equals(userId) == false) {
			out.print("id가 일치하지 않습니다");
		} else if (userMap.get("password").equals(password) == false) {
			out.print("패스워드가 일치하지 않습니다.");
		} else {
			out.print(userMap.get("name") + "님 환영합니다!!");
			
		}
		
		out.print("</body></html>");
	  }
}