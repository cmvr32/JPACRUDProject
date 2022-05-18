<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logging a New Flight</title>
</head>
<body>

	<h1>Log A New Flight</h1>
<form action="addFlight.do" method="post">
	<label for="date">Date</label><br>
	<input type="text" name="date" placeholder="Date"></input> 
	<br><br>
	<label for="takeOffTime">Takeoff Time</label><br>
	<input type="text" name="takeOffTime" placeholder="Takeoff Time"></input>
	<br><br>
	<label for="durationInHours">Flight Duration</label><br>
	<input type="text" name="durationInHours" placeholder="Duration In Hours"></input>
	<br><br>
	<label for="location">Location</label><br>
	<input type="text" name="location" placeholder="Location"></input>
	<br><br>
	<label for="aircraftTailNumber">Aircraft Tail Number</label><br>
	<input type="text" name="aircraftTailNumber" placeholder="3 digit tail #"></input>
	<br><br>
	<label for="pilotInCommandName">Pilot In Command</label><br>
	<input type="text" name="pilotInCommandName" placeholder="Full Name"></input>
	<br><br>
	<label for="pilotName">Pilot</label><br>
	<input type="text" name="pilotName" placeholder="Full Name"></input>
	<br><br>
	<label for="crewCheifName">Crew Chief's Name</label><br>
	<input type="text" name="crewCheifName" placeholder="Full Name"></input>
	<br><br>
	<label for="medicName">Medic's Name</label><br>
	<input type="text" name="medicName" placeholder="Full Name"></input>
	<br><br>
	<label for="missionEnviroment">Mission Enviroment (Training/Combat)</label><br>
	<input type="text" name="missionEnviroment" placeholder="'Training' or 'Combat'"></input>
	<br><br>
	<label for="missionType">Mission Type (MEDEVAC/Fire/Air Assult)</label><br>
	<input type="text" name="missionType" placeholder="'MEDEVAC; or 'Fire' or 'Air Assult'"></input>
	<br><br>
	<label for="specialEquipment">Special Equipment (Sling Load/Rescue Hoist/Fire Buckets/240s)</label><br>
	<input type="text" name="specialEquipment" placeholder="'Slingload' or 'Hoist' or 'Fire Bucket' or '240s'"></input>
	<br><br><br>
	
	
	<input type="submit"/>
	
</form>

</body>
</html>