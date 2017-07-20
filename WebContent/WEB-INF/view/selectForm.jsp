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
	<form:form action="" method="get" commandName="user">
		<table>
			<tr>
				<td>部门：</td>
				<td>
					<form:select path="deptId">
						<form:option value="1">开发部</form:option>
						<form:option value="2">财务部</form:option>
						<form:option value="3">市场部</form:option>
					</form:select>	
		</table>
	</form:form>
</body>
</html>