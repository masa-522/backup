/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2017-12-22 06:22:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/workspace-takeda/backup/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/solare/WEB-INF/lib/struts2-core-2.3.20.jar!/META-INF/struts-tags.tld", Long.valueOf(1416572074000L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.20.jar", Long.valueOf(1507171396000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005faction;

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
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      out.write("\r\n");
      out.write("<html lang=“ja”>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- フォントの読み込み -->\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Kanit:200'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans:400italic'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Josefin+Sans'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Josefin+Slab'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("<!-- colorbox(jQueryプラグイン)のcss -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"colorbox-master/colorbox.css\" />\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"favicon.ico\" href=\"../img/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQueryの読み込み -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- flexslider(jQueryプラグイン)の読み込み -->\r\n");
      out.write("<script src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/css_browser_selector.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- colorbox(jQueryプラグイン)のjs -->\r\n");
      out.write("<script src=\"colorbox-master/jquery.colorbox-min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t(function($) {\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\tvar thumbs = $(\".thumb img\");\r\n");
      out.write("\t\t\tvar top_images = $(\".top img\");\r\n");
      out.write("\t\t\tthumbs.hover(function() {\r\n");
      out.write("\t\t\t\ttop_images.hide().eq(thumbs.index($(this))).show();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})(jQuery);\r\n");
      out.write("\t(function($) {\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\tvar thumbs2 = $(\".thumb2 img\");\r\n");
      out.write("\t\t\tvar top_images2 = $(\".top2 img\");\r\n");
      out.write("\t\t\tthumbs2.hover(function() {\r\n");
      out.write("\t\t\t\ttop_images2.hide().eq(thumbs2.index($(this))).show();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})(jQuery);\r\n");
      out.write("\t$(window).load(function() {\r\n");
      out.write("\t\t$('.flexslider').flexslider({\r\n");
      out.write("\t\t\tslideshowSpeed : 5000,\r\n");
      out.write("\t\t\t/*mousewheel: true,*/\r\n");
      out.write("\t\t\tslideshow : true\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\tjQuery(function() {\r\n");
      out.write("\t\tjQuery('a[href^=#]').click(function() {\r\n");
      out.write("\t\t\tvar speed = 800;\r\n");
      out.write("\t\t\tvar href = jQuery(this).attr(\"href\");\r\n");
      out.write("\t\t\tvar target = jQuery(href == \"#\" || href == \"\" ? 'html' : href);\r\n");
      out.write("\t\t\tvar position = target.offset().top;\r\n");
      out.write("\t\t\tjQuery('body,html').animate({\r\n");
      out.write("\t\t\t\tscrollTop : position\r\n");
      out.write("\t\t\t}, speed, 'swing');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t/*colorboxのjquery*/\r\n");
      out.write("\t\t$(\".colorbox\").colorbox({\r\n");
      out.write("\t\t\trel : 'colorbox', //colorboxがグループ化されるため、画面に［次へ・戻る］ボタン表示される\r\n");
      out.write("\t\t\ttransition : \"elastic\", //[\"elastic\",\"fade\",\"none\"]、デフォルト＝elastic\r\n");
      out.write("\t\t\tspeed : 400, //写真表示スピード（切替）\r\n");
      out.write("\t\t\topacity : 0.85, //背景の透明度[0...1]、デフォルト=0.85\r\n");
      out.write("\t\t\twidth : \"800px\"\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".centerImg {\r\n");
      out.write("\twidth: 815px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\toutline: double 15px #000000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("\tborder-right-width: 1px;\r\n");
      out.write("\tborder-left-width: 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content {\r\n");
      out.write("\tmargin-left: 75px;\r\n");
      out.write("\tmargin-right: 75px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#reservbtn {\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmargin-right: auto\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#resbtn {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cube {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-family font-family: margin-top: -25px;\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\t-webkit-box-sizing: border-box;\r\n");
      out.write("\t-moz-box-sizing: border-box;\r\n");
      out.write("\t-webkit-user-select: none;\r\n");
      out.write("\tperspective: 500px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cube span {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tborder: #000000 solid 1px;\r\n");
      out.write("\t/*キューブの枠線*/\r\n");
      out.write("\tpointer-events: none;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cube span:nth-child(1) {\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tbackground-color: #000000;\r\n");
      out.write("\t/*回転後の背景色*/\r\n");
      out.write("\ttransform: rotateX(90deg);\r\n");
      out.write("\ttransition: all 0.2s ease;\r\n");
      out.write("\ttransform-origin: 50% 50% -25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cube span:nth-child(2) {\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\t/*回転前の文字色*/\r\n");
      out.write("\tbackground-color: rgb(255, 255, 255);\r\n");
      out.write("\t/*回転前の背景色*/\r\n");
      out.write("\ttransform: rotateX(0deg);\r\n");
      out.write("\ttransition: all 0.2s ease;\r\n");
      out.write("\ttransform-origin: 50% 50% -25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cube:hover span:nth-child(1) {\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("\t/*回転後の文字色*/\r\n");
      out.write("\ttransition: all 0.2s ease;\r\n");
      out.write("\ttransform: rotateX(0deg);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cube:hover span:nth-child(2) {\r\n");
      out.write("\tbackground-color: #000000;\r\n");
      out.write("\t/*回転後の下の色*/\r\n");
      out.write("\ttransition: all 0.2s ease;\r\n");
      out.write("\ttransform: rotateX(-90deg);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".safaribtn {\r\n");
      out.write("\tdisplay: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".safari .safaribtn {\r\n");
      out.write("\tdisplay: inline\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".safari a {\r\n");
      out.write("\ttext-decoration: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".safari a, a:hover, a:visited, a:link, a:active {\r\n");
      out.write("\tcolor: black\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".safari a.safaribtn {\r\n");
      out.write("\tfont-size: 1em;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("\tpadding-bottom: 10px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tborder: 2px solid;\r\n");
      out.write("\tborder-color: #aaaaaa #444444 #444444 #aaaaaa;\r\n");
      out.write("\tbackground: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".safari a.safaribtn:hover {\r\n");
      out.write("\tbackground: #777777;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#safarimenu_countainer {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\twidth: 800px;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tmargin-bottom: 50px\r\n");
      out.write("}\r\n");
      out.write("/*\r\n");
      out.write("\r\n");
      out.write(".safari .safaribtn {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("\tfont-size: 19px;\r\n");
      out.write("\tfont-family: margin-top : -25px;\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".safari .safaribtn span{\r\n");
      out.write("    border-top: 1px solid #ccc;\r\n");
      out.write("    border-right: 1px solid #999;\r\n");
      out.write("    border-bottom: 1px solid #999;\r\n");
      out.write("    border-left: 1px solid #ccc;\r\n");
      out.write("    padding: 5px 20px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    color: #666;\r\n");
      out.write("    background-color:white\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("*/\r\n");
      out.write(".safari #info {\r\n");
      out.write("\tclaer: both\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".safari .cube span {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".safari3 .cube span:nth-child(1) {\r\n");
      out.write("\tdisplay: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".safari3 .cube span:nth-child(2) {\r\n");
      out.write("\tcdisplay: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".safari3 .cube:hover span:nth-child(1) {\r\n");
      out.write("\tdisplay: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".safari3 .cube:hover span:nth-child(2) {\r\n");
      out.write("\tdisplay: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* / #infobtn {\r\n");
      out.write("\tmargin-left: 300px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#shopinfobb {\r\n");
      out.write("\tfont-family: 'Kanit', sans-serif;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-family: 'Kanit', sans-serif;\r\n");
      out.write("\twidth: 700px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".copy {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<title>Solare</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--\r\n");
      out.write("Using Modernizr.js for smartphone.\r\n");
      out.write("http://modernizr.com\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h1 id=\"top\">Solare</h1>\r\n");
      out.write("\t<p id=\"sub\">~Italian&amp;French Restaurant~</p>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<hr color=\"black\">\r\n");
      out.write("\t<div id=\"cubeMain\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"cubeconteiner\">\r\n");
      out.write("\t\t\t<a class=\"cube menu\" href=\"#info\"> <span>Info</span> <span>Info</span>\r\n");
      out.write("\t\t\t</a> <a class=\"cube menu\" href=\"#menu\"> <span>Menu</span> <span>Menu</span>\r\n");
      out.write("\t\t\t</a> <a class=\"cube menu\" href=\"#course\"> <span>Course</span> <span>Course</span>\r\n");
      out.write("\t\t\t</a> <a class=\"cube menu\" href=\"GoToReservationPageAction\"> <span>Reservation</span>\r\n");
      out.write("\t\t\t\t<span>Reservation</span>\r\n");
      out.write("\t\t\t</a> <a class=\"cube menu\" href=\"#aboutus\"> <span>AboutUs</span> <span>AboutUs</span>\r\n");
      out.write("\t\t\t</a> <a class=\"cube menu\" href=\"#shopinfo\"> <span>ShopInfo</span> <span>ShopInfo</span>\r\n");
      out.write("\t\t\t</a> <a class=\"cube menu\" href=\"GoToMyPageAction\"> <span>MyPage</span>\r\n");
      out.write("\t\t\t\t<span>MyPage</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"safarimenu_countainer\">\r\n");
      out.write("\t\t<a class=\"safaribtn menu\" href=\"#info\"> Info </a> <a\r\n");
      out.write("\t\t\tclass=\"safaribtn menu\" href=\"#menu\"> Menu </a> <a\r\n");
      out.write("\t\t\tclass=\"safaribtn menu\" href=\"#course\">Course </a> <a\r\n");
      out.write("\t\t\tclass=\"safaribtn menu\" href=\"GoToReservationPageAction\">\r\n");
      out.write("\t\t\tReservation </a> <a class=\"safaribtn menu\" href=\"#aboutus\">AboutUs </a> <a\r\n");
      out.write("\t\t\tclass=\"safaribtn menu\" href=\"#shopinfo\">ShopInfo </a> <a\r\n");
      out.write("\t\t\tclass=\"safaribtn menu\" href=\"GoToMyPageAction\">MyPage </a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Information -->\r\n");
      out.write("\t<h2 id=\"info\" class=\"bline\" style=\"width: 6.5em;\">Information</h2>\r\n");
      out.write("\t<hr color=\"black\">\r\n");
      out.write("\t<div class=\"flexslider\">\r\n");
      out.write("\t\t<ul class=\"slides\">\r\n");
      out.write("\t\t\t<li><img src=\"img/info1.jpg\" alt=\"\" width=\"840\" height=\"430\" />\r\n");
      out.write("\t\t\t\t<p class=\"flex-caption\">温かみ溢れる落ち着いた店内</p></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li><img src=\"img/info3.jpg\" alt=\"\" width=\"840\" height=\"430\" />\r\n");
      out.write("\t\t\t\t<p class=\"flex-caption\">仔牛のフィレステーキ オーロラ風</p></li>\r\n");
      out.write("\t\t\t<li><img src=\"img/info4.jpg\" alt=\"\" width=\"840\" height=\"430\" />\r\n");
      out.write("\t\t\t\t<p class=\"flex-caption\">苺のドルチェ</p></li>\r\n");
      out.write("\t\t\t<li><img src=\"img/info5.jpg\" alt=\"\" width=\"840\" height=\"430\" />\r\n");
      out.write("\t\t\t\t<p class=\"flex-caption\">多種のワインを取り揃えております</p></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Menu -->\r\n");
      out.write("\t<h2 id=\"menu\" class=\"bline\" style=\"width: 4.2em\">Menu</h2>\r\n");
      out.write("\t<hr size=\"2\" color=\"#000000\">\r\n");
      out.write("\t<p id=\"menuex\">\r\n");
      out.write("\t\t国産の食材のみを使用したしたイタリアン・フレンチ料理の数々 <br> その一部をご紹介致します。 <br>\r\n");
      out.write("\t\t季節や仕入れ状況によってメニューが異なりますので、 <br> 詳しくはご来店いただいて店内メニューでご確認ください。 <br>\r\n");
      out.write("\t\t<br> <br>\r\n");
      out.write("\t\t<!--colorbox--------------------------->\r\n");
      out.write("\t<div class=\"centerImg\">\r\n");
      out.write("\t\t<a class=\"colorbox\" href=\"img/01.jpg\" title=\"クリームコロッケバジル添え\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/01.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/02.jpg\" title=\"サーモンのムニエル\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/02.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/03.jpg\" title=\"トマトソースのサーモン蒸し\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/03.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/04.jpg\" title=\"バジルと鯛のクリームソテー\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/04.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/05.jpg\" title=\"特製ソースの鰹のたたきサラダ\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/05.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/06.jpg\" title=\"さっぱりオリーブサラダ\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/06.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/07.jpg\" title=\"白身魚のホワイトソース和え\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/07.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/08.jpg\" title=\"さいころステーキデミグラスソース\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/08.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/09.jpg\" title=\"きのことトマトとハンバーグ\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/09.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/10.jpg\" title=\"かにクリームコロッケ\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/10.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/11.jpg\" title=\"冷製トマトマカロニサラダ\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/11.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/12.jpg\" title=\"トマトミートソースパスタ\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/12.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/13.jpg\" title=\"半熟卵ときのこのクリームパスタ\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/13.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/14.jpg\" title=\"海鮮和風パスタ\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/14.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/15.jpg\" title=\"ズッキーニとバジルオイルのプチハンバーグ\">\r\n");
      out.write("\t\t\t<img src=\"img/15.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/16.jpg\" title=\"店長おすすめ！本日の創作料理\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/16.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/17.jpg\" title=\"オイスターソースのイタリアン春巻き\">\r\n");
      out.write("\t\t\t<img src=\"img/17.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/18.jpg\" title=\"黒豚ハムのブランブレッド\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/18.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/19.jpg\" title=\"アイスキャラメルワッフル\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/19.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/20.jpg\" title=\"ラズベリーハートケーキ\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/20.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/21.jpg\" title=\"アイスキャラメルパンケーキ\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/21.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/22.jpg\" title=\"イチゴとクリームのカントゥチーニ\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/22.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/23.jpg\" title=\"特製アイスプチトゥロン\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/23.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a> <a class=\"colorbox\" href=\"img/24.jpg\" title=\"イチゴラズベリータワー\"> <img\r\n");
      out.write("\t\t\tsrc=\"img/24.jpg\" width=\"200\" height=\"133\">\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--colorbox/--------------------------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Course -->\r\n");
      out.write("\t<h2 id=\"course\" class=\"bline\" style=\"width: 4.5em\">Course</h2>\r\n");
      out.write("\t<hr size=\"2\" color=\"#000000\">\r\n");
      out.write("\r\n");
      out.write("\t<p id=\"coursetxt\">\r\n");
      out.write("\t\t季節の食材の味を最大限に引き出した当店自慢のコース料理 <br>\r\n");
      out.write("\t\t本場フランスで腕を磨いたシェフが腕を振るった珠玉の料理をご堪能ください。 <br> <strong>※コースメニューは事前に予約が必要になります。<br>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;&nbsp;お電話、またはホームページのReservationよりご予約をお願い致します。\r\n");
      out.write("\t\t</strong>\r\n");
      out.write("\t</p>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"coursemenu\">\r\n");
      out.write("\t\t<table id=\"courselist\">\r\n");
      out.write("\t\t\t<caption>~Course Menu~</caption>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"a\">Course A</th>\r\n");
      out.write("\t\t\t\t<th class=\"b\">Course B</th>\r\n");
      out.write("\t\t\t\t<th class=\"c\">Course C</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"a\">2hour</th>\r\n");
      out.write("\t\t\t\t<th class=\"b\">3hour</th>\r\n");
      out.write("\t\t\t\t<th class=\"c\">3hour</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"a\">5,000yen</th>\r\n");
      out.write("\t\t\t\t<th class=\"b\">7,500yen</th>\r\n");
      out.write("\t\t\t\t<th class=\"c\">10,000yen</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"a\">1,シザーサラダ</th>\r\n");
      out.write("\t\t\t\t<th class=\"b\">1,白身魚のカルパッチョ</th>\r\n");
      out.write("\t\t\t\t<th class=\"c\">1,新鮮野菜のサラダ \"オーロラ風”</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"a\">2,グラタンスープ</th>\r\n");
      out.write("\t\t\t\t<th class=\"b\">2,野菜ミネストローネ</th>\r\n");
      out.write("\t\t\t\t<th class=\"c\">2,ヴィシソワーズ</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"a\">3,ホエー豚の香草焼き</th>\r\n");
      out.write("\t\t\t\t<th class=\"b\">3,車えびのトマトクリーム煮</th>\r\n");
      out.write("\t\t\t\t<th class=\"c\">3,牛フィレとトリュフのファンタジー</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"a\">4,ペペロンチーノ</th>\r\n");
      out.write("\t\t\t\t<th class=\"b\">4,カルボナーラ</th>\r\n");
      out.write("\t\t\t\t<th class=\"c\">4,えびとブロッコリーのパスタ</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"a\">5,ガトーショコラ</th>\r\n");
      out.write("\t\t\t\t<th class=\"b\">5,紅茶のシフォンケーキ</th>\r\n");
      out.write("\t\t\t\t<th class=\"c\">5,三種のチーズリゾット</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th class=\"a\"></th>\r\n");
      out.write("\t\t\t\t<th class=\"b\"></th>\r\n");
      out.write("\t\t\t\t<th class=\"c\">6,濃厚ティラミス</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t<br> <br> <br>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"resbtn\">\r\n");
      out.write("\t\t\t<p>ご予約、ご予約状況のご確認はこちらから</p>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- About Us -->\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<h2 id=\"aboutus\" class=\"bline\" style=\"width: 6em\">About Us</h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr size=\"2\" color=\"#000000\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"aboutText\">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<strong>大切な人と大切なひと時を・・・</strong>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t当ホームページをご覧戴き誠に有難うございます。 <br> オーナーシェフの半田と申します。 <br>\r\n");
      out.write("\t\t\t当店は御茶ノ水の片隅で2015年初春に、都会にひっそりとたたずむオアシスの場としてオープン致しました。 <br>\r\n");
      out.write("\t\t\t四季折々の料理をオーナーシェフが表現することをテーマとしております。 <br>\r\n");
      out.write("\t\t\t野菜果実をよりおいしく食べていただけるよう、あらゆる調理技法を駆使し、 <br>\r\n");
      out.write("\t\t\t他に比類ない一品を皆様方にご提供したいと存じます。\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<img src=\"img/info1.jpg\" alt=\"\" width=\"440\" height=\"250\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ShopInfo -->\r\n");
      out.write("\t<h2 id=\"shopinfo\" class=\"bline\" style=\"width: 5.5em\">ShopInfo</h2>\r\n");
      out.write("\t<hr size=\"2\" color=\"#000000\">\r\n");
      out.write("\t<div id=\"shopinfobb\" align=\"center\">\r\n");
      out.write("\t\t<h3>Tel. 01-2345-6789</h3>\r\n");
      out.write("\t\t<h3>Lunch 12:30～15:00 / Dinner 18:00～24:00</h3>\r\n");
      out.write("\t\t<h3>〒113-0034 東京都文京区湯島3丁目2-12 御茶ノ水天神ビル2F</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 500px; margin: auto;\">\r\n");
      out.write("\t<!-- GoogleMap -->\r\n");
      out.write("\t\t<iframe\r\n");
      out.write("\t\t\tsrc=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3239.910248408922!2d139.76482297877934!3d35.70382618382467!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x60188c18b82a5b79%3A0xf4b11fd9c5add54c!2z44CSMTEzLTAwMzQg5p2x5Lqs6YO95paH5Lqs5Yy65rmv5bO277yT5LiB55uu77yS4oiS77yR77ySIOW-oeiMtuODjuawtOWkqeelnuODk-ODqw!5e0!3m2!1sja!2sjp!4v1460439784843\"\r\n");
      out.write("\t\t\twidth=\"500\" height=\"300\" style=\"border: 0\"></iframe>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"topbtn\">\r\n");
      out.write("\r\n");
      out.write("\t\t<a href=\"#top\">\r\n");
      out.write("\t\t\t<button class=\"button4\">Top</button>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<hr class=\"foot\">\r\n");
      out.write("\t<p class=\"copy\">\r\n");
      out.write("\t\t<small>Copyright © 2017 Solare. All Rights Reserved.</small>\r\n");
      out.write("\t</p>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /top.jsp(511,3) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("GoToReservationPageAction");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<button class=\"button4\" type=\"submit\">Reservation</button>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }
}
