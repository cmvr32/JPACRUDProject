package com.skilldistillery.flightlog.data;

import java.util.List;

import com.skilldistillery.flightlog.entities.Flight;

public interface FlightDAO {
	
	Flight findById(int flightId);
	List<Flight> findAll();

}
