<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.jenkins.demo.SaveDelegate"%>
<%@page import="java.util.List"%>
<%@page import="com.jenkins.demo.Users"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Jenkins Demo</title>
<style type="text/css">
	
	.heading {
		width: 200px;
		border: 1px solid;
		text-align: center;
		font-size: 1.5em;
	}
	
	table td {
		width: 200px;
		border: 1px solid;
	}
	
</style>
</head>
<body style="background-color:rgba(0, 112, 255, 0.17)">
	<div>
		<h1>Meet Jenkins</h1>
		<h4>Click <a href="index.jsp">here</a> for another registration.</h4>
		<br/>
		<img src="jenkins.jpeg" />
		<br/>
		<br/>
		<table>
			<tr class="heading">
				<td>Name</td>
				<td>Address</td>
				<td>Phone No</td>
				<td>Email Id</td>
				<td>Country</td>
			</tr>
			<%List<Users> usersList = SaveDelegate.usersList; 
		    for(Users user : usersList) { %>
			<tr>
				<td><%=user.getName() %></td>
				<td><%=user.getAddress() %></td>
				<td><%=user.getPhoneNo() %></td>
				<td><%=user.getEmailId() %></td>
				<td><%=user.getCountry() %></td>
			</tr>
			<%} %>
		</table>
	</div>
</body>
</html>