

<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="myworld.model.WorldDto"%>
<%@page import="myworld.model.WorldDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	WorldDao dao=new WorldDao();

String num=request.getParameter("num");

WorldDto dto=dao.getData(num);
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

JSONObject ob=new JSONObject();
ob.put("num",dto.getNum());
ob.put("num",dto.getWriter());
ob.put("num",dto.getContent());
ob.put("num",dto.getAvata());
ob.put("num",sdf.format(dto.getWriteday()));
%>

<%=ob.toString() %>
