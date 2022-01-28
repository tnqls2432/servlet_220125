<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz01</title>
</head>
<body>
<%!

	public int getSum(int n) {
	int sum = 0;
	for(int i = 1; i <= n; i++){
			sum += i; 
		}
		return sum; //합계를 리턴값으로 되돌린다.
	}

%>
<h1>1부터 50까지의 합은 <%= getSum(50) %> 입니다.</h1>




<%
	
	int sum = 0;
	int[] scores = {80, 90, 100, 95, 80};
	for(int i = 0; i < scores.length; i++){
		//out.print(scores[i] + " ");
		sum += scores[i];
	}
		// out.print(sum);
		double average = (double)sum / scores.length;
		
%>
		<h1>평균 점수는 <%= average %>입니다.</h1>
<br>

<%

List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
int score= 0;
for(int i = 0; i < scoreList.size(); i++){
	if(scoreList.get(i).equals("O")){
		score += 100 / scoreList.size();
	}
}

%>
<h1>채점 결과는 <%= score %> 점 입니다.</h1>







<%!

String birthDay = "20010820";
String yearStr = birthDay.substring(0,4);
int year = Integer.valueOf(yearStr);
int age = 2022 - year + 1;

%>

<%
%>
	<h1><%= age %>세입니다.</h1>


</body>
</html>