<%@page import="mouse.MouseDao"%>
<%@page import="mouse.MouseDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

//dao
MouseDao dao=new MouseDao();

request.setCharacterEncoding("utf-8");

String writer=request.getParameter("writer");
String price=request.getParameter("price");
String color=request.getParameter("color");
String gender=request.getParameter("gender");
String mouse=request.getParameter("mouse");

//Print parameter values for debugging
System.out.println("Writer: " + writer);
System.out.println("Price: " + price);
System.out.println("Color: " + color);
System.out.println("Gender: " + gender);
System.out.println("Mouse: " + mouse);



//dto
MouseDto dto=new MouseDto();
dto.setWriter(writer);
dto.setPrice(price);
dto.setColor(color);
dto.setGender(gender);
dto.setMouse(mouse);

//insert
dao.insertMouse(dto);


%>