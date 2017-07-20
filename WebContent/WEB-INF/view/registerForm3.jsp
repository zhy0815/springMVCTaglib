<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	<form:form action="register" method="get" commandName="user">
		<table>
			<tr>
				<td>用户名：</td>
				<td>
					<form:input path="username"/>
				</td>
				<td>
					<font color="red">
						<form:errors path="username"></form:errors>
					</font>	
				</td>
			</tr>	
			<tr>
				<td>年龄：</td>
				<td>
					<form:input path="age"/>
				</td>
				<td>
					<font color="red">
						<form:errors path="age"></form:errors>
					</font>	
				</td>
			</tr>	
			<tr>
				<td>
					<input type="submit" value="提交">	
				</td>
			</tr>		
		</table>
	</form:form>
</body>
</html>