<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="test/testRequestParam?username=abc">testRequestParam</a><br>
	<a href="test/testRequestHeader">testRequestHeader</a><br>
	<a href="test/testCookie">testCookie</a><br>
	<a href="test/testUser?id=1&name=abc&pwd=123">testUser</a><br>
	<a href="test/testUser?name=abc&pwd=123">testUser</a><br>
	<form action="test/testUser?id=1&name=abc&pwd=123&userMsg.id=1&userMsg.phone=45645646&userMsg.add=adas" method="post">
		<input type="submit" value="testUserandMsg">
	</form>
	<a href="test/testRequest?name=abc">testRequest</a><br>
	
	<a href="test/modelAndView">modelAndView</a><br>
	
	<a href="test/testMap">testMap</a><br>
	<a href="test/testModel">testModel</a><br>
	
	<a href="test/testSession">testSession</a><br>
	
	<a href="test/testSessionAttribute">testSessionAttribute</a><br>
	<a href="test/testRedirect">testRedirect</a><br>
</body>
</html>