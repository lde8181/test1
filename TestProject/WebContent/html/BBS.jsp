<%@page import="com.dj.dto.PersonDTO"%>
<%@page import="com.dj.dto.BBSDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<BBSDTO> bbss = (List<BBSDTO>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<script type="text/javascript" src="/TestProject/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/TestProject/js/bootstrap.min.js"></script>
<link href="/TestProject/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h4>BBS</h4>
				<div class="table-responsive">
					<table id="mytable" class="table table-bordred table-striped">
						<thead>
							<tr>
								<th>NO</th>
								<th>TITLE</th>
								<th>OWNER</th>
								<th>DATE</th>
							</tr>
						</thead>
						<tbody>
						<%for(BBSDTO bbs : bbss) { %>
							<tr>
								<td><%=bbs.getId() %></td>
								<td><%=bbs.getTitle()%></td>
								<td><%=bbs.getOwner()%></td>
								<td><%=bbs.getDatetime()%></td>
							</tr>
						<%} %>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

</body>
</html>