/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2023-06-08 07:00:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.project_3.controller.MarksheetListCtl;
import in.co.rays.project_3.dto.MarksheetDTO;
import java.util.Iterator;
import in.co.rays.project_3.util.DataUtility;
import java.util.List;
import in.co.rays.project_3.util.ServletUtility;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.controller.ORSView;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.dto.RoleDTO;
import in.co.rays.project_3.dto.UserDTO;
import in.co.rays.project_3.controller.ORSView;

public final class MarksheetMeritListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1686038781133L));
    _jspx_dependants.put("/jsp/FooterView.jsp", Long.valueOf(1686038769430L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.MarksheetDTO");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("in.co.rays.project_3.util.ServletUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.RoleDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.util.DataUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.MarksheetListCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.UserDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.ORSView");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Marksheet Merit List View</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/CheckBox11.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".p1 {\r\n");
      out.write("\tpadding-top: 200px;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tcolor: #b62f2f;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".p4 {\r\n");
      out.write("\tbackground-image: url('");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/merit.png');\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<nav class=\"fixed-top\"> ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Header</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\"\r\n");
      out.write("\tintegrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".r{\r\n");
      out.write("background-image : linear-gradient(to bottom right, white, black );\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		UserDTO userDto = (UserDTO) session.getAttribute("user");

		boolean userLoggedIn = userDto != null;

		String welcomeMsg = "Hi, ";

		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userDto.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-lg r\"  > <a class=\"navbar-brand\"\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\"><img\r\n");
      out.write("\t\t\tsrc=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/custom.png\" width=\"190px\"\r\n");
      out.write("\t\t\theight=\"50px\"></a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarNav\" aria-controls=\"navbarNav\"\r\n");
      out.write("\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\">\r\n");
      out.write("\t\t\t<i class= \"fas fa-bars\" style=\"color:#fff; font-size: 28px;\"></i></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"#\"> <span class=\"sr-only\">(current)</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t");

					if (userLoggedIn) {
				
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (userDto.getRoleId() == RoleDTO.STUDENT) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Marksheet</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\" far fa-file-alt\"></i>Marksheet Merit List</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-copy\"></i>Get Marksheet</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t\t<a\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\"> \r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color: white;\">User</font>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My\r\n");
      out.write("\t\t\t\t\t\t\t\tProfile</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\" fa fa-file-alt\"></i>Change Password</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t");

					} else if (userDto.getRoleId() == RoleDTO.ADMIN) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px;\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">User</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-circle\"></i>Add User</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-friends\"></i>User List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Marksheet\r\n");
      out.write("\t\t\t\t\t</font></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-file\"></i>Add Marksheet</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-paste\"></i>Marksheet List</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\" far fa-file-alt\"></i>Marksheet Merit List </a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-copy\"></i>Get Marksheet</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Role</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-tie\"></i>Add Role</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-friends\"></i>Role List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">College</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-university\"></i>Add College</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-building\"></i>College List </a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Course\r\n");
      out.write("\t\t\t\t\t</font></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><i\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-book-open\"></i>Add Course</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sort-amount-down\"></i>Course List </a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Student</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-user-circle\"></i>Add Student</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-users\"></i>Student List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Faculty\r\n");
      out.write("\t\t\t\t\t</font></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-tie\"></i>Add Faculty</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><i class=\" fas fa-users\"></i>Faculty\r\n");
      out.write("\t\t\t\t\t\t\tList</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Time\r\n");
      out.write("\t\t\t\t\t\t\tTable</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-clock\"></i>Add TimeTable</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-clock\"></i>TimeTable List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Subject</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-calculator\"></i>Add Subject</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sort-amount-down\"></i>Subject List\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					}
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"\r\n");
      out.write("\t\t\t\t\tstyle=\"padding-left: 5px; padding-right: 67px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><font style=\"color: white;\">");
      out.print(welcomeMsg);
      out.write("\r\n");
      out.write("\t\t\t\t\t</font></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t");

							if (userLoggedIn) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sign-out-alt\"></i>Logout </a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My\r\n");
      out.write("\t\t\t\t\t\t\tProfile</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-edit\"></i>Change Password\r\n");
      out.write("\t\t\t\t\t\t</a> <a class=\"dropdown-item\" target=\"blank\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\"><i class=\"fas fa-clone\"></i>Java\r\n");
      out.write("\t\t\t\t\t\t\tDoc </a>\r\n");
      out.write("\t\t\t\t\t\t");

							} else {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sign-in-alt\"><b> Login</b></i> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.USER_REGISTRATION_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fas fa-registered\"><b> User Registration</b></i></a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("</nav>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"p4\">\r\n");
      out.write("\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<form action=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t<h1 class=\"text-light font-weight-bold\">Marksheet Merit List</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- <div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

			if (!ServletUtility.getSuccessMessage(request).equals("")) {
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-4 alert alert-success alert-dismissible\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t<font color=\"#008000\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font>\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");

			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t");

		if (!ServletUtility.getErrorMessage(request).equals("")) {
		
      out.write("\r\n");
      out.write("\t\t<div class=\" col-md-4 alert alert-danger alert-dismissible\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("\t\t\t<h4>\r\n");
      out.write("\t\t\t\t<font color=\"red\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font>\r\n");
      out.write("\t\t\t</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

		}
		
      out.write("\r\n");
      out.write("\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      in.co.rays.project_3.dto.MarksheetDTO dto = null;
      dto = (in.co.rays.project_3.dto.MarksheetDTO) _jspx_page_context.getAttribute("dto", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (dto == null){
        dto = new in.co.rays.project_3.dto.MarksheetDTO();
        _jspx_page_context.setAttribute("dto", dto, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

	int pageNo = ServletUtility.getPageNo(request);
	int pageSize = ServletUtility.getPageSize(request);
	int index = ((pageNo - 1) * pageSize) + 1;

	List list = ServletUtility.getList(request);
	Iterator<MarksheetDTO> it = list.iterator();
	if (list.size() != 0) {
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</br>\r\n");
      out.write("\t<div style=\"margin-left: 87%;\" class=\"pb-2\">\r\n");
      out.write("\r\n");
      out.write("\t\t<a href=\"/project_3/ctl/JasperCtl\" class=\"btn btn-lg btn-warning \"\r\n");
      out.write("\t\t\trole=\"button\" target=\"blank\"> <span class=\"fa fa-print mr-1\"></span>Print\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"margin-bottom: 20px;\" class=\"table-responsive\">\r\n");
      out.write("\t\t<b>\r\n");
      out.write("\t\t\t<table class=\"table table-responsive\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-info\"\r\n");
      out.write("\t\t\t\t\tstyle=\"background-image: url('");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/avatar-g92feff2a2_1920.webp');\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"background-color: #8C8C8C;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">S.NO</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">RollNo</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">Physics</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">Chemistry</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">Maths</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">Total</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">Percentage(%)</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t");

					while (it.hasNext()) {
						dto = it.next();
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(index++);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(dto.getRollNo());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(dto.getName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(dto.getPhysics());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(dto.getChemistry());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(dto.getMaths());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");

								int total = (dto.getChemistry() + dto.getPhysics() + dto.getMaths());
								
      out.print(total);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");

								float percentage = ((total * 100) / 300);
								
      out.write(' ');
      out.print(percentage);
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</b>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"padding-left: 48%;\">\r\n");
      out.write("\t\t<input type=\"submit\" name=\"operation\" class=\"btn btn-dark btn-md\"\r\n");
      out.write("\t\t\tstyle=\"font-size: 17px\" value=\"");
      out.print(MarksheetListCtl.OP_BACK);
      out.write("\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" name=\"pageNo\" value=\"");
      out.print(pageNo);
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"pageSize\" value=\"");
      out.print(pageSize);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write(" position: fixed;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   bottom: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("/*      background-color: #343a40;\r\n");
      out.write(" */      color: white;\r\n");
      out.write("   text-align: center;\r\n");
      out.write(" background-image:  linear-gradient(to bottom right, white, black, grey);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<h5>&copy; RAYS Technologies</h5></center>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
