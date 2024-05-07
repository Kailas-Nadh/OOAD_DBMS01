package com.ilp03.entity;

public class EmployeeTravel {

	private Departments departments;
	private Hotels hotels;
	private Employees employees;
	private TravelRequests travelRequests;
	private TravelExpenses travelExpenses;
	private Accomodations accomodations;

	public EmployeeTravel(Departments departments, Hotels hotels, Employees employees, TravelRequests travelRequests,
			TravelExpenses travelExpenses, Accomodations accomodations) {
		this.departments = departments;
		this.hotels = hotels;
		this.employees = employees;
		this.travelRequests = travelRequests;
		this.travelExpenses = travelExpenses;
		this.accomodations = accomodations;
	}

	public Departments getDepartments() {
		return departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

	public Hotels getHotels() {
		return hotels;
	}

	public void setHotels(Hotels hotels) {
		this.hotels = hotels;
	}

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public TravelRequests getTravelRequests() {
		return travelRequests;
	}

	public void setTravelRequests(TravelRequests travelRequests) {
		this.travelRequests = travelRequests;
	}

	public TravelExpenses getTravelExpenses() {
		return travelExpenses;
	}

	public void setTravelExpenses(TravelExpenses travelExpenses) {
		this.travelExpenses = travelExpenses;
	}

	public Accomodations getAccomodations() {
		return accomodations;
	}

	public void setAccomodations(Accomodations accomodations) {
		this.accomodations = accomodations;
	}

}
