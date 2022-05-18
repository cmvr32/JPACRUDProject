<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Details</title>
</head>
<body>

<h1>Flight #${flight.id}</h1>

<form action="directToUpdateFlight.do" >
	<input type="hidden" name="id" value="${flight.id}"/>
	<button> Edit Flight </button>
</form>
<br>
<form action="directToDeleteFlight.do" >
	<input type="hidden" name="id" value="${flight.id}"/>
	<button> Delete Flight </button>
</form> 
<br>
<form action="index.do" >
	<button> Return To Home Page </button>
</form><br>

<div>
 <%--  <h3>Date: </h3> ${flight.date}
  <h3>Takeoff Time: </h3> ${flight.takeOffTime}
  <h3>Duration: </h3> ${flight.durationInHours}
  <h3>Location: </h3> ${flight.location}
  <h3>Aircraft Tail Number: </h3> ${flight.aircraftTailNumber}
  <h3>Pilot In Command: </h3> ${flight.pilotInCommandName}
  <h3>Pilot: </h3> ${flight.pilotName}   
  <h3>Crew Chief Name: </h3> ${flight.crewCheifName}
  <h3>Medic Name: </h3> ${flight.medicName}
  <h3>Mission Enviroment: </h3> ${flight.missionEnviroment}
  <h3>Mission Type: </h3> ${flight.missionType}
  <h3>Special Equipment: </h3> ${flight.specialEquipment} --%>

  ${flight}
  
</div>

</body>
</html>