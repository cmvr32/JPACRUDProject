<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Tracker</title>
</head>
<body>

<h1>Flight Tracker Application</h1>

<form action="directToAddFlight.do">
	<button>Add a Flight</button>
</form>

<!-- <form action="directToUpdateFlight.do" >
	<button> Update a Flight </button>
</form> -->

<!-- <form action="getFlight.do" method="GET">
<h3>Show Flight by ID </h3>
<input type="text" name="fid"/>
<input type="submit" value="Show Flight" />
</form>  -->

<h3>All Flights: </h3>
<ul>
<c:forEach var="flight" items="${flights}">
	<li><a href="getFlight.do?fid=${flight.id}"> ${flight.id}, ${flight.date}, ${flight.location}</a></li>

</c:forEach>

</ul>


</body>
</html>