package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz08")
public class GetMethodQuiz08 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		String search = request.getParameter("search");
		
		List<String> list = new ArrayList<>(Arrays.asList(
				"강남역 최고 맛집 소개 합니다.", 
				"오늘 기분 좋은 일이 있었네요.", 
				"역시 맛집 데이트가 제일 좋네요.", 
				"집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
				"자축 저 오늘 생일 이에요."));
		

		PrintWriter out = response.getWriter();
		out.print("<html><head><title>검색 결과</title></head><body>");
		
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String line = iter.next();
			if (line.contains(search)) {
				out.print(line + "<br>");
			}
		
			// 풀이1)
//			int index = line.indexOf(search);
//			if(index > -1) {
//				// 맛집  <b> 태그 추가  -> <b>맛집
//				StringBuffer sb = new StringBuffer();
//				sb.append(search);
//				sb.insert(index, "<b>");
//				sb.insert(index + search.length() + 3, "</b>"); // <b>맛집</b>
//				
//				out.print( sb + "<br>");
//			}
			
			//풀이2)
//			if(line.contains(search)) {
//				String[] words = line.split(search);
//				out.print(words[0] + "<b>" + search + "</b>" + words[1] + "<br>");
//			}
			
			//풀이3)
			
//			if(line.contains(search)) {
//			line = line.replace(search, "<b>" + search + "</b>");
//			out.print(line + "<br>");
//			}
//		}
//		
//		out.print("</body></html>");
		
		
	}
  }
}
