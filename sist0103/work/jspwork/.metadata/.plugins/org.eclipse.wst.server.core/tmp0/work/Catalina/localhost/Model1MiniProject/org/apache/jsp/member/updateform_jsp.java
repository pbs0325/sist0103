/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-22 08:11:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.StringTokenizer;
import data.dto.MemberDto;
import data.dao.MemberDao;

public final class updateform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("data.dao.MemberDao");
    _jspx_imports_classes.add("java.util.StringTokenizer");
    _jspx_imports_classes.add("data.dto.MemberDto");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(function(){\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	  \r\n");
      out.write("	  //이메일 선택 이벤트\r\n");
      out.write("	  $(\"#selemail\").change(function(){\r\n");
      out.write("		  \r\n");
      out.write("		  if($(this).val()=='-'){\r\n");
      out.write("			  $(\"#email2\").val('');\r\n");
      out.write("		  }else{\r\n");
      out.write("			  $(\"#email2\").val($(this).val());\r\n");
      out.write("		  }\r\n");
      out.write("	  });\r\n");
      out.write("	  \r\n");
      out.write("  })\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");

   //num
   String num=request.getParameter("num");
   MemberDao dao=new MemberDao();
   MemberDto dto=dao.getDataMember(num);
   
   //email @구분자로 분리
   StringTokenizer st=new StringTokenizer(dto.getEmail(),"@");
   String email1=st.nextToken();
   String email2=st.nextToken();


      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"margin: 100px 200px; width: 500px;\">\r\n");
      out.write("	<form action=\"member/updateaction.jsp\" method=\"post\" onsubmit=\"return check(this)\">\r\n");
      out.write("	<input type=\"hidden\" name=\"num\" value=\"");
      out.print(num );
      out.write("\">\r\n");
      out.write("	   <table class=\"table table-bordered\" >\r\n");
      out.write("	      <caption align=\"top\"><b>마이정보수정</b></caption>\r\n");
      out.write("	      <tr>\r\n");
      out.write("	        <th width=\"100\" class=\"table-success\">아이디</th>\r\n");
      out.write("	        <td>\r\n");
      out.write("	        	<b>");
      out.print(dto.getId() );
      out.write("</b>\r\n");
      out.write("	          </div>\r\n");
      out.write("	        </td>\r\n");
      out.write("	      </tr>\r\n");
      out.write("	      \r\n");
      out.write("	      \r\n");
      out.write("	      <tr>\r\n");
      out.write("	        <th width=\"100\" class=\"table-success\">이름</th>\r\n");
      out.write("	        <td>\r\n");
      out.write("	          <input type=\"text\" name=\"name\" class=\"form-control\" required=\"required\" style=\"width: 120px;\"\r\n");
      out.write("	          value=\"");
      out.print(dto.getName());
      out.write("\">\r\n");
      out.write("	        </td>\r\n");
      out.write("	      </tr>\r\n");
      out.write("	      \r\n");
      out.write("	      <tr>\r\n");
      out.write("	        <th width=\"100\" class=\"table-success\">핸드폰</th>\r\n");
      out.write("	        <td>\r\n");
      out.write("	          <input type=\"text\" name=\"hp\" class=\"form-control\" required=\"required\" style=\"width: 180px;\"\r\n");
      out.write("	          value=\"");
      out.print(dto.getHp());
      out.write("\">\r\n");
      out.write("	        </td>\r\n");
      out.write("	      </tr>\r\n");
      out.write("	      <tr>\r\n");
      out.write("	        <th width=\"100\" class=\"table-success\">주소</th>\r\n");
      out.write("	        <td>\r\n");
      out.write("	          <input type=\"text\" name=\"addr\" class=\"form-control\" required=\"required\" style=\"width: 330px;\"\r\n");
      out.write("	          value=\"");
      out.print(dto.getAddr());
      out.write("\">\r\n");
      out.write("	        </td>\r\n");
      out.write("	      </tr>\r\n");
      out.write("	      <tr>\r\n");
      out.write("	        <th width=\"100\" class=\"table-success\">이메일</th>\r\n");
      out.write("	        <td>\r\n");
      out.write("	         <div class=\"d-inline-flex\">\r\n");
      out.write("	          <input type=\"text\" name=\"email1\" class=\"form-control\" required=\"required\"\r\n");
      out.write("	          style=\"width: 80px;\" value=\"");
      out.print(email1);
      out.write("\">\r\n");
      out.write("	          <b style=\"margin-left: 10px;\">@</b>\r\n");
      out.write("	          <input type=\"text\" name=\"email2\" id=\"email2\" class=\"form-control\" required=\"required\"\r\n");
      out.write("	          style=\"width: 120px; margin-left: 10px;\" value=\"");
      out.print(email2);
      out.write("\">\r\n");
      out.write("	          <select id=\"selemail\" class=\"form-control\" style=\"margin-left: 10px;\">\r\n");
      out.write("	             <option value=\"-\">직접입력</option>\r\n");
      out.write("	             <option value=\"naver.com\">네이버</option>\r\n");
      out.write("	             <option value=\"nate.com\">네이트</option>\r\n");
      out.write("	             <option value=\"gmail.com\">구글</option>\r\n");
      out.write("	             <option value=\"daum.net\">다음</option>\r\n");
      out.write("	             \r\n");
      out.write("	          </select>\r\n");
      out.write("	          </div>\r\n");
      out.write("	        </td>\r\n");
      out.write("	      </tr>\r\n");
      out.write("	      \r\n");
      out.write("	      <tr>\r\n");
      out.write("	        <td colspan=\"2\" align=\"center\">\r\n");
      out.write("	            <button type=\"submit\" class=\"btn btn-outline-info\"\r\n");
      out.write("	            style=\"width: 100px;\">수정하기</button>\r\n");
      out.write("	            <button type=\"reset\" class=\"btn btn-outline-info\"\r\n");
      out.write("	            style=\"width: 100px;\">초기화</button>\r\n");
      out.write("	        </td>\r\n");
      out.write("	      </tr>\r\n");
      out.write("	   </table>\r\n");
      out.write("	</form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
