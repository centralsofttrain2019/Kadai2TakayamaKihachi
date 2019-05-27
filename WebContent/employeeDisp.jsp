<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean
		id="beans"
		class="jp.co.central_soft.co.jp.train2019.bean.EmployeeListDispBean"
		scope="request" />

<%@ page import="jp.co.central_soft.co.jp.train2019.bean.EmployeeDispBean" %>
<%@ page import="jp.co.central_soft.co.jp.train2019.bean.EmployeeListDispBean" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<title>BeanStartWebApp</title>
</head>
<body>
<h1>従業員情報</h1>
<table>
	<tr>
		<th class="title">EmployeeID</th>
		<th class="title">EmployeeName</th>
		<th class="title">BloodType</th>
		<th class="title">eMail</th>
		<th class="title">HireFiscalYear</th>
		<th class="title">Birthday</th>
		<th class="title">Heigh</th>
		<th class="title">Weight</th>
	</tr>
<% for(EmployeeDispBean bean : beans.getEmpList()){ %>
<tr>
	<td class="employee_info"> <%=bean.getEmployeeID() %> </td>
	<td class="employee_info"><%=bean.getEmployeeName() %> </td>
	<td class="employee_info"><%=bean.getBloodType() %> </td>
	<td class="employee_info"><%=bean.geteMail() %> </td>
	<td class="employee_info"><%=bean.getHireFiscalYear() %> </td>
	<td class="employee_info"><%=bean.getBirthday() %> </td>
	<td class="employee_info"><%=bean.getHeight() %> </td>
	<td class="employee_info"><%=bean.getWeight() %> </td>
</tr>
<% } %>
</table>
<%-- <%= beans.toString() %> --%>



</body>
</html>