<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="get" action="checkBoxForm" modelAttribute="reader">
		<table>
			<tr>
				<td>选择课程：</td>
				<td>
					<form:checkbox path="courses" value="JavaEE" label="JavaEE"/>&nbsp;
					<form:checkbox path="courses" value="Spring" label="Spring"/>&nbsp;
					<form:checkbox path="courses" value="Mybatis" label="Mybatis"/>&nbsp;
				</td>
			</tr>
		</table>
		<form:checkbox path="reader" value="true"/>已经阅读相关协议
	</form:form>	
</body>
</html>