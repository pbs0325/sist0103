<%@page import="myworld.model.WorldDto"%>
<%@page import="myworld.model.WorldDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	
	String num=request.getParameter("unum");
	String writer=request.getParameter("uwriter");
	String content=request.getParameter("content");
	String avata=request.getParameter("avata");
	
	WorldDto dto = new WorldDto();
	
	//dto담기
	dto.setNum(num);
	dto.setNum(writer);
	dto.setNum(content);
	dto.setNum(avata);
	
	//dao선언
	WorldDao dao=new WorldDao();
	
	//수정메서드 호출
	dao.updateWorld(dto);
	%>
</body>
</html>