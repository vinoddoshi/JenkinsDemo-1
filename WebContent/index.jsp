
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Jenkins Demo</title>
</head>
<body style="background-color:rgba(0, 112, 255, 0.17)">
	<div style='padding-left:300px;'>
		<h1>Meet Jenkins</h1>
		<h4>Fill the following information to register yourself to
			jenkins.</h4>
		<form name='demoForm' action='/JenkinsDemo/SaveUserList' method="get">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type='text' id='txtName' name="txtName"/></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><textarea id='txtAddress' name="txtAddress"></textarea></td>
				</tr>
				<tr>
					<td>Phone No:</td>
					<td><input type='text' id='txtPhoneNo' name="txtPhoneNo"/></td>
				</tr>
				<tr>
					<td>Email Id:</td>
					<td><input type='text' id='txtEmailId' name="txtEmailId"/></td>
				</tr>
				<tr>
					<td>Country:</td>
					<td><select><option id="optCountry" name="optCountry">India</option>
							<option>United States</option>
							<option>Canada</option>
							<option>Australia</option>
							<option>England</option>
							<option>Germany</option>
							<option>France</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><input type='submit'/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>