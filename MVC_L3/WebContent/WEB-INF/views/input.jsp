<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
form{
	width:300px;
 	border:1px black solid;
 	margin:0px auto;
 	text-align: center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/empController/emp" method="post" modelAttribute="emp">
	<c:if test="${id != null}">
		id:<form:input path="id" readonly="true"/><br>
		<input type="hidden" name="_method" value="PUT"> 
	</c:if>
		LastName:<form:input path="lastName" /><br>
		Email:<form:input path="email" /><br>
		<%
			Map<Integer,Object> map = new HashMap<Integer,Object>();
			map.put(0, "Female");
			map.put(1, "Male");
			request.setAttribute("map", map);
		%>
		Gender:<form:radiobuttons path="gender" items="${map}"/><br>
		Departemt:<form:select path="department.id" items="${department}" itemValue="id" itemLabel="departmentName"></form:select><br>
		<input type="submit">
	</form:form>
</body>
</html>