<%@page import="data.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
 <%
   String id=request.getParameter("id");
   MemberDao dao=new MemberDao();
   String name=dao.getName(id);
 %>
 
 <div style="margin: 100px 250px;">
    <img alt="" src="image2/flower_ani/s6.JPG">
    <b><%=name %>님의 회원가입을 축하합니다</b>
    <br><br>
    <button type="button" class="btn btn-info"
    onclick="location.href='index.jsp?main=login/loginmain.jsp'">로그인</button>
    <button type="button" class="btn btn-info"
    onclick="location.href='index.jsp'">메인</button>
 </div>
</body>
</html>