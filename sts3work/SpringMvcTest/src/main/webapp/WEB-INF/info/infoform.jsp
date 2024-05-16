<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
   <form action="read" method="post">
     <table class="table table-bordered" style="width: 600px;">
        <tr>
          <th width="200">이름</th>
          <td>
            <input type="text" name="name" class="form-control" style="width: 120px;">
          </td>
        </tr>
        <tr>
          <th>좋아하는색</th>
          <td>
            <input type="color" name="color" class="form-control"
            value="#ffccff" style="width: 50px;">
          </td>
        </tr>
        <tr>
           <th>취미</th>
             <td>
               <div class="form-check">
               	 <input type="checkbox" name="hobby" class="form-check-input" value="영화감상">
                 <label class="form-check-label">영화감상</label>
               </div>
               
               <div class="form-check">
                 <input type="checkbox" name="hobby" class="form-check-input" value="게임">
                 <label class="form-check-label">게임</label>
                </div>
                
                <div class="form-check">
                 <input type="checkbox" name="hobby" class="form-check-input" value="여행">
                 <label class="form-check-label">여행</label>
                </div>
                
                <div class="form-check">
                  <input type="checkbox" name="hobby" class="form-check-input" value="코딩">
                  <label class="form-check-label">코딩</label>
                </div>
                 
                <div class="form-check">
                 <input type="checkbox" name="hobby" class="form-check-input" value="낚시">
                 <label class="form-check-label">낚시</label>
                </div>
            
               
             </td>
             
        </tr>
        
        <tr>
          <th>가장 재미있는 언어</th>
          <td>
            <select name="lang">
               <option value="Java">Java</option>
               <option value="Html">Html</option>
               <option value="Ajax">Ajax</option>
               <option value="Spring">Spring</option>
            </select>
          </td>
        </tr>
        
        <tr>
           <td colspan="2" align="center">
             <button type="submit" class="btn btn-info">서버에 전송</button>
           </td>
        </tr>
     </table>
   </form>
</body>
</html>