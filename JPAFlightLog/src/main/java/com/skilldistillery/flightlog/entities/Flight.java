package com.skilldistillery.flightlog.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight_log")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String date;
	@Column(name="takeoff_time")
	private String takeOffTime;
	@Column(name="duration_in_hours")
	private double durationInHours;
	private String location;
	@Column(name="aircraft_tail_number")
	private double aircraftTailNumber;
	@Column(name="pilot_in_command_name")
	private double pilotInCommandName;
	@Column(name="pilot_name")
	private double pilotName;
	@Column(name="crew_cheif_name")
	private double crewCheifName;
	@Column(name="medic_name")
	private double medicName;
	@Column(name="mission_enviroment")
	private double missionEnviroment;
	@Column(name="mission_type")
	private double missionsType;
	@Column(name="special_equipment")
	private double specialEquipment;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTakeOffTime() {
		return takeOffTime;
	}
	public void setTakeOffTime(String takeOffTime) {
		this.takeOffTime = takeOffTime;
	}
	public double getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(double durationInHours) {
		this.durationInHours = durationInHours;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getAircraftTailNumber() {
		return aircraftTailNumber;
	}
	public void setAircraftTailNumber(double aircraftTailNumber) {
		this.aircraftTailNumber = aircraftTailNumber;
	}
	public double getPilotInCommandName() {
		return pilotInCommandName;
	}
	public void setPilotInCommandName(double pilotInCommandName) {
		this.pilotInCommandName = pilotInCommandName;
	}
	public double getPilotName() {
		return pilotName;
	}
	public void setPilotName(double pilotName) {
		this.pilotName = pilotName;
	}
	public double getCrewCheifName() {
		return crewCheifName;
	}
	public void setCrewCheifName(double crewCheifName) {
		this.crewCheifName = crewCheifName;
	}
	public double getMedicName() {
		return medicName;
	}
	public void setMedicName(double medicName) {
		this.medicName = medicName;
	}
	public double getMissionEnviroment() {
		return missionEnviroment;
	}
	public void setMissionEnviroment(double missionEnviroment) {
		this.missionEnviroment = missionEnviroment;
	}
	public double getMissionsType() {
		return missionsType;
	}
	public void setMissionsType(double missionsType) {
		this.missionsType = missionsType;
	}
	public double getSpecialEquipment() {
		return specialEquipment;
	}
	public void setSpecialEquipment(double specialEquipment) {
		this.specialEquipment = specialEquipment;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", date=" + date + ", takeOffTime=" + takeOffTime + ", durationInHours="
				+ durationInHours + ", location=" + location + ", aircraftTailNumber=" + aircraftTailNumber
				+ ", pilotInCommandName=" + pilotInCommandName + ", pilotName=" + pilotName + ", crewCheifName="
				+ crewCheifName + ", medicName=" + medicName + ", missionEnviroment=" + missionEnviroment
				+ ", missionsType=" + missionsType + ", specialEquipment=" + specialEquipment + "]";
	}
	
	
	

	
	

}
