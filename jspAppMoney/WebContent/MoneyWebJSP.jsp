<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="MoneyServlet" method="post">
			<table>
				<tr>
					<td><label>Montant :</label></td>
					<td><input type="text" name="amount"></td>
				</tr>
				<tr>
					<td colspan="2">
						<select name="devise" id="devise">
							<option value="">PLEASE CHOOSE AN OPTION</option>
							<option value="EUR">EUR</option>
							<option value="USD">USD</option>
							<option value="GBP">GBP</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<label>Mantant :</label>
					</td>
					<td>
						<input type="text" name="amount1">		
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<select name="devise1" id="device">
							<option value="">PLEASE CHOOSE AN OPTION</option>
							<option value="EUR">EUR</option>
							<option value="USD">USD</option>
							<option value="GBP">GBP</option>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="add">
					</td>
				</tr>
			</table>			
		</form>
	</div>
	<div>
		<input type="text" name="res" placeholder= <%= request.getAttribute("res") %>>
	</div>
</body>
</html>