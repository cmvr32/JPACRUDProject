package com.skilldistillery.flightlog.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.flightlog.data.FlightDAO;
import com.skilldistillery.flightlog.entities.Flight;

@Controller
public class FlightController {
	
	@Autowired
	private FlightDAO dao;
	
	@RequestMapping(path = {"/", "index.do"})
	public String index(Model model) {
		model.addAttribute("flights", dao.findAll());
		return "index";
	}
	
	@RequestMapping("getFlight.do")
	public String showFlights(@RequestParam Integer fid, Model model) {
		Flight flight = dao.findById(fid);
		model.addAttribute("flight", flight);
		return "flight/ViewFlightInfo";
	}
	
	@RequestMapping("directToAddFlight.do")	
	public String directToAddForm() {
		return "flight/AddFlight";
	}
	
	@RequestMapping("directToUpdateFlight.do")
	public String directToUpdateFlight() {
		return "flight/UpdateFlight";
	}
	
	@RequestMapping("directToIndex.do")
	public String directToIndex() {
		return "index";
	}
	
	@RequestMapping("directToDeleteFlight.do")
	public String directToDeleteFlight() {
		return "flight/DeleteFlight";
	}
	
	@RequestMapping("addFlight.do") 
		public String addFlight(@RequestParam String date, 
								@RequestParam String takeOffTime, 
								@RequestParam double durationInHours, 
								@RequestParam String location, 
								@RequestParam int aircraftTailNumber,
								@RequestParam String pilotInCommandName,
								@RequestParam String pilotName,
								@RequestParam String crewCheifName,
								@RequestParam String medicName,
								@RequestParam String missionEnviroment,
								@RequestParam String missionType,
								@RequestParam String specialEquipment,
								Model model) {
			Flight flight = new Flight();
			flight.setDate(date);
			flight.setTakeOffTime(takeOffTime);
			flight.setDurationInHours(durationInHours);
			flight.setLocation(location);
			flight.setAircraftTailNumber(aircraftTailNumber);
			flight.setPilotInCommandName(pilotInCommandName);
			flight.setPilotName(pilotName);
			flight.setCrewCheifName(crewCheifName);
			flight.setMedicName(medicName);
			flight.setMissionEnviroment(missionEnviroment);
			flight.setMissionsType(missionType);
			flight.setSpecialEquipment(specialEquipment);
			flight = dao.addFlight(flight);
			model.addAttribute("flight", flight);
			return "flight/viewFlightInfo";
		}
	}
	


