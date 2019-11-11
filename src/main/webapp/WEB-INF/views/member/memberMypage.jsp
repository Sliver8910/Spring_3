<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
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
<%
if(memberDTO == null){
	request.setAttribute("msg", "로그인 하세요");
	request.setAttribute("path", "../index.jsp");
	RequestDispatcher view = request.getRequestDispatcher("../common/common_result.jsp");
	view.forward(request, response);
}else{
%>
	<h1>회원정보</h1>
	<p>아이디 : <%= memberDTO.getId() %><p>
	<p>이름 : <%= memberDTO.getName() %><p>
	<p>전화번호 : <%= memberDTO.getPhone() %><p>
	<p>이메일 : <%= memberDTO.getEmail() %><p>
	<p>등급 : <%= memberDTO.getLev() %><p>
	<a href="./memberUpdateForm.jsp" class="btn btn-primary">회원정보 수정</a>
	<a href="./memberDeleteResult.jsp" class="btn btn-danger">회원 탈퇴</a>
<%	
}
%>


</body>
</html> --%>