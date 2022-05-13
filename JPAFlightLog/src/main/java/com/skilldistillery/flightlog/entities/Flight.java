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
	private Integer aircraftTailNumber;
	@Column(name="pilot_in_command_name")
	private String pilotInCommandName;
	@Column(name="pilot_name")
	private String pilotName;
	@Column(name="crew_cheif_name")
	private String crewCheifName;
	@Column(name="medic_name")
	private String medicName;
	@Column(name="mission_enviroment")
	private String missionEnviroment;
	@Column(name="mission_type")
	private String missionsType;
	@Column(name="special_equipment")
	private String specialEquipment;
	
	
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

	public Integer getAircraftTailNumber() {
		return aircraftTailNumber;
	}
	public void setAircraftTailNumber(Integer aircraftTailNumber) {
		this.aircraftTailNumber = aircraftTailNumber;
	}

	public String getPilotInCommandName() {
		return pilotInCommandName;
	}
	public void setPilotInCommandName(String pilotInCommandName) {
		this.pilotInCommandName = pilotInCommandName;
	}
	public String getPilotName() {
		return pilotName;
	}
	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}
	public String getCrewCheifName() {
		return crewCheifName;
	}
	public void setCrewCheifName(String crewCheifName) {
		this.crewCheifName = crewCheifName;
	}
	public String getMedicName() {
		return medicName;
	}
	public void setMedicName(String medicName) {
		this.medicName = medicName;
	}
	public String getMissionEnviroment() {
		return missionEnviroment;
	}
	public void setMissionEnviroment(String missionEnviroment) {
		this.missionEnviroment = missionEnviroment;
	}
	public String getMissionsType() {
		return missionsType;
	}
	public void setMissionsType(String missionsType) {
		this.missionsType = missionsType;
	}
	public String getSpecialEquipment() {
		return specialEquipment;
	}
	public void setSpecialEquipment(String specialEquipment) {
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
