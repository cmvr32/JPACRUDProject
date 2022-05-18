<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Update Existing Flight</title>
</head>
<body>

	${flight}

	<h1>Update Flight #${flight.id}</h1>
	<form action="updateFlight.do" , method="post">
		<input type="hidden" name="id" value="${flight.id}" /> 
		<label for="date">Date ${flight.date}</label><br> <input type="text"
			name="date" value="${flight.date}"></input> 
			<br> <br> <label for="takeOffTime">Takeoff
			Time</label><br> <input type="text" name="takeOffTime"></input> <br>
		<br> <label for="durationInHours">Flight Duration</label><br>
		<input type="text" name="durationInHours"></input> <br> <br>
		<label for="location">Location</label><br> <input type="text"
			name="location"></input> <br> <br> <label
			for="aircraftTailNumber">Aircraft Tail Number</label><br> <input
			type="text" name="aircraftTailNumber"></input> <br> <br> <label
			for="pilotInCommandName">Pilot In Command</label><br> <input
			type="text" name="pilotInCommandName"></input> <br> <br> <label
			for="pilotName">Pilot</label><br> <input type="text"
			name="pilotName"></input> <br> <br> <label
			for="crewCheifName">Crew Chief's Name</label><br> <input
			type="text" name="crewCheifName"></input> <br> <br> <label
			for="medicName">Medic's Name</label><br> <input type="text"
			name="medicName"></input> <br> <br> <label
			for="missionEnviroment">Mission Enviroment (Training/Combat)</label><br>
		<input type="text" name="missionEnviroment"></input> <br> <br>
		<label for="missionType">Mission Type (MEDEVAC/Fire/Air
			Assult)</label><br> <input type="text" name="missionType"></input> <br>
		<br> <label for="specialEquipment">Special Equipment
			(Sling Load/Rescue Hoist/Fire Buckets/240s)</label><br> <input
			type="text" name="specialEquipment"></input> <br> <br> <br>
		<input type="submit" />

	</form>

</body>
</html>