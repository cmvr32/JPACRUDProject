package com.skilldistillery.flightlog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String directToUpdateFlight(int id, Model model ) {
		model.addAttribute("flight", dao.findById(id));
		return "flight/UpdateFlight";
	}
	
	
	@RequestMapping("directToDeleteFlight.do")
	public String directToDeleteFlight(@RequestParam int id, Model model) {
		dao.removeFlight(id);
		model.addAttribute("id", id);
		return "flight/DeleteFlight";
	}
	

	
	@PostMapping("addFlight.do") 
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
			flight.setMissionType(missionType);
			flight.setSpecialEquipment(specialEquipment);
			flight = dao.addFlight(flight);
			model.addAttribute("flight", flight);
			return "flight/ViewFlightInfo";
		}
	
	@PostMapping ("updateFlight.do")
	public String updateFlight(Flight flight, Model model) {
		dao.updateFlight(flight);
		model.addAttribute("flight", flight);
		
		return "flight/ViewFlightInfo";
		
	}
	}
	


