<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
table tr td{
 border:1px black solid;
}
table{

 	border:1px black solid;
 	margin:0px auto;
 	text-align: center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>main</title>
</head>
<body>
	
		
		<table>
			<tr >
				<td colspan="7"><a href="${pageContext.request.contextPath}/empController/emp" class="add">add</a></td>
			</tr>
			<tr>
				<td>ID</td>
				<td>LastName</td>
				<td>Email</td>
				<td>Gender</td>
				<td>Departemt</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>
			<c:forEach items="${emps}" var="employee"> 
				<tr>
					<td>${employee.id }</td>
					<td>${employee.lastName }</td>
					<td>${employee.email }</td>
					<td>${employee.gender==0?'Female':'Male'}</td>
					<td>${employee.department.departmentName }</td>
					<td><a href="${pageContext.request.contextPath}/empController/emp/${employee.id}">Edit</a></td>
					<td><a href="${pageContext.request.contextPath}/empController/emp/${employee.id}" class="del">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<form action="" method="post">
			<input type="hidden" name="_method" value="DELETE"> 
		</form>

	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
	<script type="text/javascript">
		$(function(){
			$(".del").click(function(){
				$("form").attr("action",this.href);
				$("form").submit();
				return false;
			})
			
		})
	
	</script>
</body>
</html>