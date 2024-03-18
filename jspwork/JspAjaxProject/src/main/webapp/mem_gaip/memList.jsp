<%@page import="mem_gaip.model.MemgaipDao"%>
<%@page import="mem_gaip.model.MemgaipDto"%>
<%@page import="java.util.List"%>
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
<%
MemgaipDto dto=new MemgaipDto();
MemgaipDao dao=new MemgaipDao();
List<MemgaipDto>list=dao.getAllDatas();


%>

<body>
<div style="margin: 50px 100px; width: 800px;">
	<table class="table table-bordered">
	<caption align="top"><b>회원관리</b></caption>
	<tr>
		<th width="50px">번호</th>
		<th width="80px">회원명</th>
		<th width="100px">아이디</th>
		<th width="100px">패스워드</th>
		<th width="200px">핸드폰</th>
		<th width="200px">가입일</th>
		<th width="100px">편집</th>
	</tr>
	<%
      if(list.size()==0)
      {%>
    	  <tr>
    	    <td colspan="7" align="center">
    	      <h6><b>등록된 게시글이 없습니다</b></h6>
    	    </td>
    	  </tr>
      <%}else{
    	  for(int i=0;i<list.size();i++)
    	  {
    		 MemgaipDto dto=list.get(i);
    		  %>
    		  
    		  <tr>
    		    <td align="center"><%=no--%></td>
    		    <td>
    		      <a href="contentview.jsp?num=<%=dto.getM_num()%>">
    		       <%=dto.getSubject() %>
    		      </a>
    		      
    		      <!-- 댓글개수 -->
    		      <%
    		      	if(dto.getAnswercount()>0)
    		      	{%>
    		      		<a href="contentview.jsp?num=<%=dto.getNum()%>&currentPage=<%=currentPage %>#alist" style="color:red;">[<%=dto.getAnswercount() %>]</a>
    		      	<%}
    		      %>
    		    </td>
    		    <td align="center"><%=dto.getWriter() %></td>
    		    <td align="center"><%=sdf.format(dto.getWriteday()) %></td>
    		    <td align="center"><%=dto.getReadcount() %></td>
    		  </tr>
    	  <%}
      }
    %>
	</table>
</div>


		 <button type="button" class="btn btn-outline-primary btn-sm"
         onclick=""><i class="bi bi-pencil-square"></i>수정</button>
         <button type="button" class="btn btn-outline-danger btn-sm"
         onclick=""><i class="bi bi-trash"></i>삭제</button>

</body>
</html>