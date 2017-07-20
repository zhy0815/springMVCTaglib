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
	<form:form action="" method="get" modelAttribute="employee">
		<table>
			<tr>
				<td>选择部门：</td>
				<td>
					<form:checkboxes items="${depts }" path="depts" itemLabel="name" itemValue="id"/>
				</td>
			</tr>		
		</table>
	</form:form>
</body>
</html>