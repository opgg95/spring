/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-06-13 19:44:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mocar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/mocar/header.jsp", Long.valueOf(1655149430663L));
    _jspx_dependants.put("/mocar/footer.jsp", Long.valueOf(1655149430662L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"UTF-8\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\"\n");
      out.write("	content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("<meta name=\"generator\" content=\"Hugo 0.88.1\">\n");
      out.write("<title>mocar</title>\n");
      out.write("\n");
      out.write("<link\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\n");
      out.write("	rel=\"stylesheet\"\n");
      out.write("	integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css\" />\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".nav-link:hover {\n");
      out.write("	color: #fff;\n");
      out.write("	background-color: #0d6efd;\n");
      out.write("}\n");
      out.write("#slider { width:50%;}\n");
      out.write("#slideList > p { display:none;}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("		<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css\" integrity=\"sha256-p6xU9YulB7E2Ic62/PX+h59ayb3PBJ0WFTEQxq0EjHw=\" crossorigin=\"anonymous\" />\n");
      out.write("		<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.js\" integrity=\"sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30=\" crossorigin=\"anonymous\"></script>\n");
      out.write("		<script>\n");
      out.write("			$(document).ready(function(){\n");
      out.write("				var imgList = $('#slideList p');\n");
      out.write("\n");
      out.write("				$('#slider').slider({\n");
      out.write("					min:0,\n");
      out.write("					max:119,\n");
      out.write("					value:1,\n");
      out.write("					slide:function(event,ui){\n");
      out.write("						imgList.hide();\n");
      out.write("						imgList.eq(ui.value).show();\n");
      out.write("					}\n");
      out.write("\n");
      out.write("				});\n");
      out.write("			});\n");
      out.write("		</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<div class=\"row g-0\">\n");
      out.write("		<div class=\"d-flex flex-column p-3 bg-light order-first col-md-3 col-lg-2\">\n");
      out.write("			<a href=\"/mocar/index.jsp\"\n");
      out.write("				class=\"d-flex align-items-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none\">\n");
      out.write("				<span class=\"fs-4\">Logo</span>\n");
      out.write("			</a>\n");
      out.write("			<hr>\n");
      out.write("			<ul class=\" nav nav-pills flex-column\" id=\"navbarToggler8\">\n");
      out.write("				<li class=\"nav-item\"><a href=\"/mocar/rent2.jsp\" class=\"nav-link link-dark\"\n");
      out.write("					aria-current=\"page\"> 렌트예약 </a></li>\n");
      out.write("				<li class=\"nav-item\"><a href=\"/mocar/border.jsp\" class=\"nav-link link-dark\">\n");
      out.write("						공지사항 </a></li>\n");
      out.write("				<li class=\"nav-item\"><a href=\"/mocar/BBS.jsp\" class=\"nav-link link-dark\">\n");
      out.write("						Q&amp;A </a></li>\n");
      out.write("				<li class=\"nav-item\"><a href=\"/mocar/map.jsp\"\n");
      out.write("					class=\"nav-link link-dark\"> 찾아오시는 길 </a></li>\n");
      out.write("				<li class=\"nav-item\"><a href=\"/mocar/contact.jsp\"\n");
      out.write("					class=\"nav-link link-dark\"> Contact </a></li>\n");
      out.write("			</ul>\n");
      out.write("			<hr>\n");
      out.write("\n");
      out.write("			<a href=\"#\"\n");
      out.write("				class=\"d-flex align-items-center link-dark text-decoration-none\"\n");
      out.write("				id=\"dropdownUser2\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("			</a>\n");
      out.write("			<button type=\"button\" class=\"btn d-flex\" data-bs-toggle=\"modal\"\n");
      out.write("				data-bs-target=\"#login\">\n");
      out.write("				<strong>login</strong>\n");
      out.write("			</button>\n");
      out.write("\n");
      out.write("			<!-- Modal -->\n");
      out.write("			<div class=\"modal\" id=\"login\" data-bs-backdrop=\"static\"\n");
      out.write("				data-bs-keyboard=\"false\" tabindex=\"-1\"\n");
      out.write("				aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
      out.write("				<div class=\"modal-dialog modal-dialog-centered\">\n");
      out.write("					<div class=\"modal-content\">\n");
      out.write("						<div class=\"modal-header p-5 pb-4 border-bottom-0\">\n");
      out.write("							<h2 class=\"fw-bold mb-0\">login</h2>\n");
      out.write("							<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\n");
      out.write("								aria-label=\"Close\"></button>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"modal-body p-5 pt-0\">\n");
      out.write("							<form class=\"\">\n");
      out.write("								<div class=\"form-floating mb-3\">\n");
      out.write("									<input type=\"email\" class=\"form-control rounded-4\"\n");
      out.write("										id=\"floatingInput\" placeholder=\"name@example.com\"> <label\n");
      out.write("										for=\"floatingInput\">아이디</label>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form-floating mb-3\">\n");
      out.write("									<input type=\"password\" class=\"form-control rounded-4\"\n");
      out.write("										id=\"floatingPassword\" placeholder=\"Password\"> <label\n");
      out.write("										for=\"floatingPassword\">비밀번호</label>\n");
      out.write("								</div>\n");
      out.write("								<button class=\"w-100 mb-2 btn btn-lg rounded-4 btn-primary\"\n");
      out.write("									type=\"submit\">로그인</button>\n");
      out.write("								<div id=\"opt\" class=\"row\">\n");
      out.write("									<div class=\"opt_left col\">\n");
      out.write("										<a href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#resist\">회원가입</a>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"opt_right col text-end \">\n");
      out.write("										<a id=\"find1\" class=\"d-inline-block \" href=\"#\"\n");
      out.write("											data-bs-toggle=\"modal\" data-bs-target=\"#modalSignin\">ID</a>\n");
      out.write("										<p class=\"d-inline-block\">/</p>\n");
      out.write("										<a id=\"find2\" class=\"d-inline-block\" href=\"#\"\n");
      out.write("											data-bs-toggle=\"modal\" data-bs-target=\"#modalSignpw\">PW찾기</a>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("								<hr class=\"my-4\">\n");
      out.write("								<h2 class=\"fs-5 fw-bold mb-3\">다른 방법으로 로그인하기</h2>\n");
      out.write("								<button\n");
      out.write("									class=\"w-100 py-2 mb-2 btn btn-outline-success rounded-4\"\n");
      out.write("									type=\"button\" onclick=\"location.href='https://nid.naver.com/'\">\n");
      out.write("									<img src=img/naver.png style=\"width: 20px; height: 20px;\">\n");
      out.write("									네이버로 로그인하기\n");
      out.write("								</button>\n");
      out.write("							</form>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<!-- 회원가입 -->\n");
      out.write("			<div class=\"modal\" id=\"resist\" data-bs-backdrop=\"static\"\n");
      out.write("				data-bs-keyboard=\"false\" tabindex=\"-1\"\n");
      out.write("				aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
      out.write("				<div class=\"modal-dialog modal-dialog-centered\">\n");
      out.write("					<div class=\"modal-content\">\n");
      out.write("						<div class=\"modal-header p-5 pb-4 border-bottom-0\">\n");
      out.write("							<h2 class=\"fw-bold mb-0\">회원가입</h2>\n");
      out.write("							<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\n");
      out.write("								aria-label=\"Close\"></button>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"modal-body p-5 pt-0\">\n");
      out.write("							<form class=\"\">\n");
      out.write("								<div class=\"form-floating mb-3 row\"\n");
      out.write("									style='width: 100%; margin-left: 1px;'>\n");
      out.write("									<input type=\"text\" class=\"form-control rounded-4 col\"\n");
      out.write("										id=\"floatingInput\" placeholder=\"name@example.com\"> <label\n");
      out.write("										for=\"floatingInput\">아이디</label>\n");
      out.write("									<button type=\"button\" class=\"btn btn-primary col-3\"\n");
      out.write("										style='margin-left: 20px;'>중복확인</button>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form-floating mb-3\">\n");
      out.write("									<input type=\"password\" class=\"form-control rounded-4\"\n");
      out.write("										id=\"floatingPassword\" placeholder=\"Password\"> <label\n");
      out.write("										for=\"floatingPassword\">비밀번호</label>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form-floating mb-3\">\n");
      out.write("									<input type=\"password\" class=\"form-control rounded-4\"\n");
      out.write("										id=\"floatingPassword\" placeholder=\"Password\"> <label\n");
      out.write("										for=\"floatingPassword\">비밀번호 확인</label>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form-floating mb-3\">\n");
      out.write("									<input type=\"text\" class=\"form-control rounded-4\"\n");
      out.write("										id=\"floatingInput\" placeholder=\"name\"> <label\n");
      out.write("										for=\"floatingInput\">이름</label>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"container px-1\">\n");
      out.write("									<div class=\"row gx-5\">\n");
      out.write("										<div class=\"col\">\n");
      out.write("											<select class=\"form-select\"\n");
      out.write("												aria-label=\"Default select example\">\n");
      out.write("												<option selected>출생년도</option>\n");
      out.write("												<option value=\"1\">1950년</option>\n");
      out.write("												<option value=\"2\">1951년</option>\n");
      out.write("												<option value=\"3\">1952년</option>\n");
      out.write("												<option value=\"4\">1953년</option>\n");
      out.write("												<option value=\"5\">1954년</option>\n");
      out.write("												<option value=\"6\">1955년</option>\n");
      out.write("												<option value=\"7\">1956년</option>\n");
      out.write("												<option value=\"8\">1957년</option>\n");
      out.write("												<option value=\"9\">1958년</option>\n");
      out.write("												<option value=\"10\">1959년</option>\n");
      out.write("												<option value=\"11\">1960년</option>\n");
      out.write("												<option value=\"12\">1961년</option>\n");
      out.write("												<option value=\"13\">1962년</option>\n");
      out.write("												<option value=\"14\">1963년</option>\n");
      out.write("												<option value=\"15\">1964년</option>\n");
      out.write("												<option value=\"16\">1965년</option>\n");
      out.write("												<option value=\"17\">1966년</option>\n");
      out.write("												<option value=\"18\">1967년</option>\n");
      out.write("												<option value=\"19\">1968년</option>\n");
      out.write("												<option value=\"20\">1969년</option>\n");
      out.write("												<option value=\"21\">1970년</option>\n");
      out.write("												<option value=\"22\">1971년</option>\n");
      out.write("												<option value=\"23\">1972년</option>\n");
      out.write("												<option value=\"24\">1973년</option>\n");
      out.write("												<option value=\"25\">1974년</option>\n");
      out.write("												<option value=\"26\">1975년</option>\n");
      out.write("												<option value=\"27\">1976년</option>\n");
      out.write("												<option value=\"28\">1977년</option>\n");
      out.write("												<option value=\"29\">1978년</option>\n");
      out.write("												<option value=\"30\">1979년</option>\n");
      out.write("												<option value=\"31\">1980년</option>\n");
      out.write("												<option value=\"32\">1981년</option>\n");
      out.write("												<option value=\"33\">1982년</option>\n");
      out.write("												<option value=\"34\">1983년</option>\n");
      out.write("												<option value=\"35\">1984년</option>\n");
      out.write("												<option value=\"36\">1985년</option>\n");
      out.write("												<option value=\"37\">1986년</option>\n");
      out.write("												<option value=\"38\">1987년</option>\n");
      out.write("												<option value=\"39\">1988년</option>\n");
      out.write("												<option value=\"40\">1989년</option>\n");
      out.write("												<option value=\"41\">1990년</option>\n");
      out.write("												<option value=\"42\">1991년</option>\n");
      out.write("												<option value=\"43\">1992년</option>\n");
      out.write("												<option value=\"44\">1993년</option>\n");
      out.write("												<option value=\"45\">1994년</option>\n");
      out.write("												<option value=\"46\">1995년</option>\n");
      out.write("												<option value=\"47\">1996년</option>\n");
      out.write("												<option value=\"48\">1997년</option>\n");
      out.write("												<option value=\"49\">1998년</option>\n");
      out.write("												<option value=\"50\">1999년</option>\n");
      out.write("												<option value=\"51\">2000년</option>\n");
      out.write("												<option value=\"52\">2001년</option>\n");
      out.write("												<option value=\"53\">2002년</option>\n");
      out.write("												<option value=\"54\">2003년</option>\n");
      out.write("												<option value=\"55\">2004년</option>\n");
      out.write("												<option value=\"56\">2005년</option>\n");
      out.write("												<option value=\"57\">2006년</option>\n");
      out.write("												<option value=\"58\">2007년</option>\n");
      out.write("												<option value=\"59\">2008년</option>\n");
      out.write("												<option value=\"60\">2009년</option>\n");
      out.write("											</select>\n");
      out.write("										</div>\n");
      out.write("										<div class=\"col\">\n");
      out.write("											<select class=\"form-select text-end\"\n");
      out.write("												aria-label=\"Default select example\">\n");
      out.write("												<option selected>월</option>\n");
      out.write("												<option value=\"1\">1월</option>\n");
      out.write("												<option value=\"2\">2월</option>\n");
      out.write("												<option value=\"3\">3월</option>\n");
      out.write("												<option value=\"4\">4월</option>\n");
      out.write("												<option value=\"5\">5월</option>\n");
      out.write("												<option value=\"6\">6월</option>\n");
      out.write("												<option value=\"7\">7월</option>\n");
      out.write("												<option value=\"8\">8월</option>\n");
      out.write("												<option value=\"9\">9월</option>\n");
      out.write("												<option value=\"10\">10월</option>\n");
      out.write("												<option value=\"11\">11월</option>\n");
      out.write("												<option value=\"12\">12월</option>\n");
      out.write("											</select>\n");
      out.write("										</div>\n");
      out.write("										<div class=\"col\">\n");
      out.write("											<select class=\"form-select text-end\"\n");
      out.write("												aria-label=\"Default select example\">\n");
      out.write("												<option selected>일</option>\n");
      out.write("												<option value=\"1\">1일</option>\n");
      out.write("												<option value=\"2\">2일</option>\n");
      out.write("												<option value=\"3\">3일</option>\n");
      out.write("												<option value=\"4\">4일</option>\n");
      out.write("												<option value=\"5\">5일</option>\n");
      out.write("												<option value=\"6\">6일</option>\n");
      out.write("												<option value=\"7\">7일</option>\n");
      out.write("												<option value=\"8\">8일</option>\n");
      out.write("												<option value=\"9\">9일</option>\n");
      out.write("												<option value=\"10\">10일</option>\n");
      out.write("												<option value=\"11\">11일</option>\n");
      out.write("												<option value=\"12\">12일</option>\n");
      out.write("												<option value=\"13\">13일</option>\n");
      out.write("												<option value=\"14\">14일</option>\n");
      out.write("												<option value=\"15\">15일</option>\n");
      out.write("												<option value=\"16\">16일</option>\n");
      out.write("												<option value=\"17\">17일</option>\n");
      out.write("												<option value=\"18\">18일</option>\n");
      out.write("												<option value=\"19\">19일</option>\n");
      out.write("												<option value=\"20\">20일</option>\n");
      out.write("												<option value=\"21\">21일</option>\n");
      out.write("												<option value=\"22\">22일</option>\n");
      out.write("												<option value=\"23\">23일</option>\n");
      out.write("												<option value=\"24\">24일</option>\n");
      out.write("												<option value=\"25\">25일</option>\n");
      out.write("												<option value=\"26\">26일</option>\n");
      out.write("												<option value=\"27\">27일</option>\n");
      out.write("												<option value=\"28\">28일</option>\n");
      out.write("												<option value=\"29\">29일</option>\n");
      out.write("												<option value=\"30\">30일</option>\n");
      out.write("												<option value=\"31\">31일</option>\n");
      out.write("											</select>\n");
      out.write("										</div>\n");
      out.write("\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form-floating mb-3\" style='margin-top: 13px;'>\n");
      out.write("									<input type=\"email\" class=\"form-control rounded-4\"\n");
      out.write("										id=\"floatingemail\" placeholder=\"email\"> <label\n");
      out.write("										for=\"floatingemail\">이메일</label>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form-floating mb-3 row\"\n");
      out.write("									style='width: 100%; margin-left: 1px;'>\n");
      out.write("									<input type=\"text\" class=\"form-control rounded-4 col\"\n");
      out.write("										id=\"floatingInput\" placeholder=\"abcd1234\"> <label\n");
      out.write("										for=\"floatingInput\">추천인</label>\n");
      out.write("									<button type=\"button\" class=\"btn btn-primary col-3\"\n");
      out.write("										style='margin-left: 20px;'>확인</button>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form\">\n");
      out.write("									<label class=\"\"\n");
      out.write("										style='font-weight: 500; font-size: 18px; margin-bottom: 5px;'>약관\n");
      out.write("										동의</label>\n");
      out.write("									<div class=\"form-checkbox\">\n");
      out.write("										<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\n");
      out.write("											id=\"flexCheckDefault\"> <label\n");
      out.write("											class=\"form-check-label\" for=\"flexCheckDefault\"> </label> <a\n");
      out.write("											class=\"fw-bold\" href=\"#\">이용약관</a>에 동의합니다.\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"modal-footer border-0 p-0 mt-4\">\n");
      out.write("									<button type=\"button\" class=\"btn btn-primary\">가입</button>\n");
      out.write("									<button type=\"button\" class=\"btn btn-warning\"\n");
      out.write("										data-bs-dismiss=\"modal\">취소</button>\n");
      out.write("								</div>\n");
      out.write("							</form>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<!-- id찾기 -->\n");
      out.write("			<div class=\"modal\" id=\"modalSignin\" data-bs-backdrop=\"static\"\n");
      out.write("				data-bs-keyboard=\"false\" tabindex=\"-1\"\n");
      out.write("				aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
      out.write("				<div class=\"modal-dialog modal-dialog-centered\">\n");
      out.write("					<div class=\"modal-content rounded-5 shadow\">\n");
      out.write("						<div class=\"modal-header p-5 pb-4 border-bottom-0\">\n");
      out.write("							<h2 class=\"fw-bold mb-0\">ID찾기</h2>\n");
      out.write("							<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\n");
      out.write("								aria-label=\"Close\"></button>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"modal-body p-5 pt-0\">\n");
      out.write("							<form class=\"\">\n");
      out.write("								<div class=\"form-floating mb-3\">\n");
      out.write("									<input type=\"text\" class=\"form-control rounded-4\"\n");
      out.write("										id=\"floatingInput\" placeholder=\"홍길동\"> <label\n");
      out.write("										for=\"floatingInput\">이름</label>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form-floating mb-3\">\n");
      out.write("									<input type=\"email\" class=\"form-control rounded-4\"\n");
      out.write("										id=\"floatingInput\" placeholder=\"name@example.com\"> <label\n");
      out.write("										for=\"floatingInput\">이메일</label>\n");
      out.write("								</div>\n");
      out.write("							</form>\n");
      out.write("							<div class=\"text-end\">\n");
      out.write("								<button type=\"button\" class=\"btn btn-primary text-end\">확인</button>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<!-- pw찾기 -->\n");
      out.write("			<div class=\"modal\" id=\"modalSignpw\" data-bs-backdrop=\"static\"\n");
      out.write("				data-bs-keyboard=\"false\" tabindex=\"-1\"\n");
      out.write("				aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
      out.write("				<div class=\"modal-dialog modal-dialog-centered\">\n");
      out.write("					<div class=\"modal-content rounded-5 shadow\">\n");
      out.write("						<div class=\"modal-header p-5 pb-4 border-bottom-0\">\n");
      out.write("							<h2 class=\"fw-bold mb-0\">PW찾기</h2>\n");
      out.write("							<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\n");
      out.write("								aria-label=\"Close\"></button>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"modal-body p-5 pt-0\">\n");
      out.write("							<form class=\"\">\n");
      out.write("								<div class=\"form-floating mb-3\">\n");
      out.write("									<input type=\"text\" class=\"form-control rounded-4\"\n");
      out.write("										id=\"floatingInput\" placeholder=\"홍길동\"> <label\n");
      out.write("										for=\"floatingInput\">이름</label>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form-floating mb-3\">\n");
      out.write("									<input type=\"text\" class=\"form-control rounded-4\"\n");
      out.write("										id=\"floatingInput\" placeholder=\"abcd1234\"> <label\n");
      out.write("										for=\"floatingInput\">아이디</label>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form-floating mb-5\">\n");
      out.write("									<input type=\"email\" class=\"form-control rounded-4\"\n");
      out.write("										id=\"floatingInput\" placeholder=\"abcd1234\"> <label\n");
      out.write("										for=\"floatingInput\">이메일</label>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"row g-2 mb-5\">\n");
      out.write("									<div class=\"col-md\">\n");
      out.write("										<div class=\"form-floating\">\n");
      out.write("											<input type=\"password\" class=\"form-control\"\n");
      out.write("												id=\"floatingInputGrid\" placeholder=\"password\"> <label\n");
      out.write("												for=\"floatingInputGrid\">변경할 비밀번호</label>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"col-md\">\n");
      out.write("										<div class=\"form-floating\">\n");
      out.write("											<input type=\"password\" class=\"form-control\"\n");
      out.write("												id=\"floatingInputGrid\" placeholder=\"password\"> <label\n");
      out.write("												for=\"floatingInputGrid\">비밀번호 재입력</label>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("							</form>\n");
      out.write("							<div class=\"text-end\">\n");
      out.write("								<button type=\"button\" class=\"btn btn-primary text-end\">확인</button>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>");
      out.write("\r\n");
      out.write("<main class=\"ms-sm-auto col-md-9 col-lg-10\">\r\n");
      out.write("<div class=\"container col\" style=\"margin-bottom:300px;\">\r\n");
      out.write("	<div class=\"grid text-center\" style=\"margin-top:200px;\">\r\n");
      out.write("		<h1>\r\n");
      out.write("			<strong>Q&amp;A</strong>\r\n");
      out.write("		</h1>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"grid text-center mb-5\">\r\n");
      out.write("		<h4>Mo Car에게 궁금한 것을 물어보세요!</h4>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write(" 	<div class=\"row\">\r\n");
      out.write(" 	<form method=\"post\" action=\"writeAction.jsp\">\r\n");
      out.write(" 	<table class=\"table table-striped\" style=\"text-align: center; border: 1px solid #dddddd\">\r\n");
      out.write(" 			<thead>\r\n");
      out.write(" 			 <tr>\r\n");
      out.write(" 				<th colspan=\"2\" style=\"background-color: #eeeeee; text-align: center;\">게시판 글쓰기 양식</th>\r\n");
      out.write(" 				\r\n");
      out.write(" 			 </tr>\r\n");
      out.write(" 			</thead>\r\n");
      out.write(" 			<tbody>\r\n");
      out.write(" 				<tr>\r\n");
      out.write(" 						<td><input type=\"text\" class=\"form-control\" placeholder=\"글제목\" name=\"bbsTitle\" maxlength=\"50\"></td>\r\n");
      out.write(" 					</tr>\r\n");
      out.write(" 					<tr>\r\n");
      out.write(" 						<td><textarea class=\"form-control\" placeholder=\"글내용\" name=\"bbsContent\" maxlength=\"2048\" style=\"height:350px;\"></textarea></td>\r\n");
      out.write(" 					</tr>	\r\n");
      out.write(" 			</tbody>			\r\n");
      out.write(" 			</table>\r\n");
      out.write(" 			<input type=\"submit\" class=\"btn btn-primary pull-right\" style=\"width:1150px; height:30px;\" value=\"확인\">\r\n");
      out.write(" 			\r\n");
      out.write(" 	</form>\r\n");
      out.write(" 		\r\n");
      out.write(" 			\r\n");
      out.write(" 	</div>\r\n");
      out.write(" </div>\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"footer mt-auto py-3 bg-black\">\r\n");
      out.write("  <div class=\"text-center pt-3\">\r\n");
      out.write("    <p class=\"text-white-50 d-inline-block\">(주)Mocar &nbsp&nbsp</p>\r\n");
      out.write("    <p class=\"text-white-50 d-inline-block\">주소: 서울 강남구 테헤란로 146 &nbsp&nbsp</p>\r\n");
      out.write("    <p class=\"text-white-50 d-inline-block\">사업자등록번호: 010-01-12345 &nbsp&nbsp</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"text-center\">\r\n");
      out.write("    <p class=\"text-white-50 d-inline-block\">대표전화: 010-1234-5678 &nbsp&nbsp</p>\r\n");
      out.write("    <p class=\"text-white-50 d-inline-block\">mail: nmjk0123@gmail.com &nbsp&nbsp</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"text-center\">\r\n");
      out.write("  	    <p class=\"text-white-50 d-inline-block\">© 2022 Company, Inc &nbsp&nbsp</p>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<script data-cfasync=\"false\" src=\"form-submission-handler.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/momentjs/latest/moment.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\" integrity=\"sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
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
