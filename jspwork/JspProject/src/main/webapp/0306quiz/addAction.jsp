
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
request.setCharacterEncoding("utf-8");


%>

<!-- jsp:useBean은 new로 객체 생성하는것과 같아 -->
<jsp:useBean id="dao" class="intro.introDao"/>
<jsp:useBean id="dto" class="intro.introDto"/>
<!-- dto의 멤버와 같은이름의 태그는 자동으로 읽어서 dto에 넣어준다 -->
<jsp:setProperty property="*" name="dto"/>

<%
String [] hobby=request.getParameterValues("hobby");

String myhobby="";

if(hobby==null)
	  myhobby="no";
else{
	  for(int i=0;i<hobby.length;i++){
		  myhobby+=hobby[i]+",";
	  }
	  
	  myhobby=myhobby.substring(0,myhobby.length()-1);
}


dto.setHobby(myhobby);

dao.insertIntro(dto);

response.sendRedirect("introList.jsp");
%>
</body>
</html>