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
		<h2>Login</h2>
		<form action="./memberLogin" method="post">
			<div class="form-group">
				<label for="id">ID:</label> <input type="text" class="form-control"
					id="td" placeholder="Enter td"  required="required" name="id">
			</div>
			<div class="form-group">
				<label for="pw">Password:</label> <input type="password"
					class="form-control" id="pw" required="required" placeholder="Enter password" name="pw">
			</div>
			<div class="checkbox">
				<label><input type="checkbox" checked="checked" name="remember">
					Remember me</label>
			</div>
			<button type="submit" class="btn btn-primary">Login</button>
		</form>
	</div>

</body>
</html>