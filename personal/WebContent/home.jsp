<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<meta charset="utf-8">
<title>home画面</title>
	<style type="text/css">
		body{
			margin:0;
			padding:0;
			line-height:1.6;
			letter-spacing:1px;
			font-family:Helvetica,Verdana,sans-serif;
			font-size:12px;
			color:#333;
			background:#fff;
		}
		table{
			text-align:center;
			margin:0 auto;
		}
		/*========TEMPLATE LAYOUT========*/
		#top{
			width:780px;
			margin:30px auto;
			border:1px solid #333;
		}
		#header{
			width:100%;
			height:80px;
			background-color:black;
		}
		#main{
			width:100%;
			height:500px;
			text-align:center;
		}
		#footer{
			width:100%;
			height:80px;
			background-color:black;
			clear:both;
		}
		#text-center{
			display:inline-block;
			text-align:center;
		}
	</style>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>HOME</p>
		</div>
		<div id="text-center">
			<s:form action="StartAction">
				<s:submit value="商品購入"/>
			</s:form>
			<s:if test="session.id != null">
				<p>ログアウトする場合は<a href="<s:url action='LogoutAction'/>">こちら</a></p>
			</s:if>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>