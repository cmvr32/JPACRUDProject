package com.skilldistillery.flightlog.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.flightlog.entities.Flight;

@Service
@Transactional
public class FlightDaoJpaImpl implements FlightDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Flight findById(int flightId) {
		return em.find(Flight.class, flightId);
	}

	@Override
	public List<Flight> findAll() {
		String jpql = "SELECT f from Flight f";
		return em.createQuery(jpql, Flight.class).getResultList();
	}

	@Override
	public Flight addFlight(Flight flight) {
		em.persist(flight);
		return flight;
	}

	public boolean removeFlight(int id) {

		boolean removed = false;
		Flight flightToRemove = em.find(Flight.class, id);
		if (flightToRemove != null) {
			em.remove(flightToRemove);
			removed = !em.contains(flightToRemove);
		}
		return removed;

	}

	public Flight updateFlight(Flight flight) {

		Flight flightToUpdate = em.find(Flight.class, flight.getId());
		if (flightToUpdate != null) {
			flightToUpdate.setDate(flight.getDate());
			flightToUpdate.setTakeOffTime(flight.getTakeOffTime());
			flightToUpdate.setDurationInHours(flight.getDurationInHours());
			flightToUpdate.setLocation(flight.getLocation());
			flightToUpdate.setAircraftTailNumber(flight.getAircraftTailNumber());
			flightToUpdate.setPilotInCommandName(flight.getPilotInCommandName());
			flightToUpdate.setPilotName(flight.getPilotName());
			flightToUpdate.setCrewCheifName(flight.getCrewCheifName());
			flightToUpdate.setMedicName(flight.getMedicName());
			flightToUpdate.setMissionEnviroment(flight.getMissionEnviroment());
			flightToUpdate.setMissionType(flight.getMissionType());
			flightToUpdate.setSpecialEquipment(flight.getSpecialEquipment());

		}

		return flightToUpdate;
	}

}
