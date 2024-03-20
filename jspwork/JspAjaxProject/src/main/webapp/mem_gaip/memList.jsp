<%@page import="java.text.SimpleDateFormat"%>
<%@page import="mem_gaip.model.MemgaipDao"%>
<%@page import="mem_gaip.model.MemgaipDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<%
MemgaipDao dao = new MemgaipDao();
List<MemgaipDto> list = dao.getAllDatas();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
%>

<body>
	<div style="margin: 50px 100px; width: 800px;">
	<button type="button" class="btn btn-outline-info" onclick="location.href='addform.jsp'"
  style="margin-left: 650px;">
  <i class="bi bi-pencil"></i>글쓰기</button>
		<table class="table table-bordered">
			<caption align="top">
				<b>회원관리</b>
			</caption>
			<tr>
				<th width="80px">번호</th>
				<th width="80px">회원명</th>
				<th width="100px">아이디</th>
				<th width="100px">패스워드</th>
				<th width="200px">핸드폰</th>
				<th width="200px">가입일</th>
				<th width="100px">편집</th>
			</tr>
			<%
			if (list.size() == 0) {
			%>
			<tr>
				<td colspan="7" align="center">
					<h6>
						<b>등록된 게시글이 없습니다</b>
					</h6>
				</td>
			</tr>
			<%
			} else {
			for (int i = 0; i < list.size(); i++) {
				MemgaipDto dto = list.get(i);
			%>
			<tr>
				<td><%=dto.getM_num()%></td>
				<td><%=dto.getM_name()%></td>
				<td><%=dto.getM_id()%></td>
				<td><%=dto.getM_pass()%></td>
				<td><%=dto.getM_hp()%></td>
				<td><%=sdf.format(dto.getGaipday())%></td>
				<td>
					<button type="button" class="btn btn-outline-primary btn-sm"
						onclick="">
						수정
					</button>
					<button type="button" class="btn btn-outline-danger btn-sm"
						onclick="location.href='deletepassForm.jsp?num=<%=dto.getM_num() %>'">
						삭제
					</button>
				</td>
			</tr>

			<%
			}
			}
			%>
		</table>
	</div>




</body>
</html>