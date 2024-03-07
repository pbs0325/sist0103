<%@page import="team.model.TeamDao"%>
<%@page import="team.model.TeamDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
<%
	request.setCharacterEncoding("uft-8");

	String name=request.getParameter("name");
	String driver=request.getParameter("driver");
	String addr=request.getParameter("addr");
	
	//dto 선언
	TeamDto dto=new TeamDto();
	dto.setName(name);
	dto.setDriver(driver==null?"없음":"있음");
	dto.setAddr(addr);
	
	//dao 선언
	TeamDao dao=new TeamDao();
	//insert메서드 호출
	dao.insertTeam(dto);
	
	//목록파일로 이동
	response.sendRedirect("teamList.jsp");
	
	
%>--%>

<%
request.setCharacterEncoding("utf-8");


%>

<!-- jsp:useBean은 new로 객체 생성하는것과 같아 -->
<jsp:useBean id="dao" class="team.model.TeamDao"/>
<jsp:useBean id="dto" class="team.model.TeamDto"/>
<!-- dto의 멤버와 같은이름의 태그는 자동으로 읽어서 dto에 넣어준다 -->
<jsp:setProperty property="*" name="dto"/>

<%
String driver=request.getParameter("driver");
dto.setDriver(driver==null?"없음":"있음");

dao.insertTeam(dto);

response.sendRedirect("teamList.jsp");
%>
</body>
</html>