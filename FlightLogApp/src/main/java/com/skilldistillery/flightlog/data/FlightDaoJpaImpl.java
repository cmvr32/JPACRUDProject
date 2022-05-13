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
		return null;
	}
	
}
