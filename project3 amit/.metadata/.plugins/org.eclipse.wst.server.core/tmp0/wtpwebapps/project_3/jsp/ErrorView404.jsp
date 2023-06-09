<%@page import="in.co.rays.project_3.controller.ORSView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
<link rel="icon" type="image/png"
	href="<%=ORSView.ERROR_CTL%>/img/logo.png">
	<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>

	
</head>
<style type="text/css">
.b{
background-image: url('<%=ORSView.APP_CONTEXT%>/img/400error.jpeg');
	background-size: 100%;
	background-repeat: no repeat;
	class= "img-responsive";
	
}</style>
<body class="b">
	<br>
	<br>
	<br>
	<div align="center">
 		<%-- <img src="<%=ORSView.APP_CONTEXT%>/img/404.jpg" width="550" height="250"> --%>

		<h1>Oops! something went wrong</h1>
		<font style="color: red; size: 25px;">Requested
			resource is not available </font>
		<div style="width: 25%; text-align: justify;">
			<h3>Try:</h3>
			<ul>
				<li>check the network cables,modem,and router</li>
				<li>reconnect to Wi-Fi</li>
			</ul>
		</div>
	</div><!-- onclick="history.back() " -->
	<h4 align="center">
		<font size="5px" color="white"> <a  class=" btn btn-primary  " href="<%=ORSView.WELCOME_CTL%>"
			style="color: white;">*Please click here to Go Back*</a></font>
	</h4>

</body>
</html>