<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootstrap.jsp"/>
</head>
<body>
<c:import url="../layout/nav.jsp"/>
	<div class="container">
		<h2>Member Join Page</h2>
		<form action="./memberJoin" method="post">
			<div class="form-group">
				<label for="id">Id:</label> <input type="text" required="required"
					class="form-control" id="id" placeholder="Enter id" name="id">
			</div>
			<div class="form-group">
				<label for="pw">Password:</label> <input type="password"
					class="form-control" required="required" id="pw"
					placeholder="Enter password" name="pw">
			</div>
			<div class="form-group">
				<label for="name">Name:</label> <input type="text"
					class="form-control" required="required" id="name"
					placeholder="Enter name" name="name">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" required="required" id="email"
					placeholder="Enter email" name="email">
			</div>
			<div class="form-group">
				<label for="phone">Phone:</label> <input type="tel"
					class="form-control" id="phone" required="required"
					placeholder="Enter phone" name="phone">
			</div>
			<button type="submit" class="btn btn-primary">회원가입</button>
		</form>
	</div>

</body>
</html>