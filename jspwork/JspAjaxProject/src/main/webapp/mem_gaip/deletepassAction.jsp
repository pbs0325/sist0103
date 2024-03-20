<%@page import="mem_gaip.model.MemgaipDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<%
String num = request.getParameter("num");
String pass = request.getParameter("pass");

MemgaipDao dao=new MemgaipDao();

boolean a=dao.deleteMemgaip(num, pass);

if(a)
	{%>
<script type="text/javascript">
  alert("삭제되었습니다\n목록으로 이동합니다");
  location.href='memList.jsp';
</script>
<%}else{%>
<script type="text/javascript">
  alert("비밀번호가 틀렸습니다");
  history.back();
</script>
<%}%>
</head>
<body>
</body>
</html>