<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<h1>사칙 연산 계산기</h1>
		<form method="post" action="/lesson02/quiz04_1.jsp">
			<div class="d-flex">
				<input type="text" class="form-control col-2" name="number1">
				<select name="operator" class="form-control col-1">
					<option value="plus">+</option>
					<option value="minus">-</option>
					<option value="multiple">*</option>
					<option value="divide">/</option>
				</select>
				<input type="text" class="form-control col-2" name="number2">
				
				<input type="submit" class="btn btn-success" value="계산하기">
			</div>
		</form>
	</div>
</body>
</html>