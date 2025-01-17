package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.EmployeesDAO;
import com.ilp03.entity.EmployeeTravel;
import com.ilp03.entity.Employees;

public class EmployeeServiceImpl implements EmployeesService {

	@Override
	public void getTravelDataBasedOnEmployees() {

		try {
			Scanner scanner = new Scanner(System.in);
			Connection connection = EmployeesDAO.getConnection();
			System.out.println("Enter the employee name:");
			String employeeFirstName = scanner.nextLine();
			ArrayList<EmployeeTravel> employeeTravelList = EmployeesDAO.getTravelDataBasedOnEmployees(connection,
					employeeFirstName);
			System.out.println(
					"First name:\tLast Name:\tDept Name:\tDestination:\tTravel Purpose:\tTransportation Type:\tStart Date:\tEnd Date:\tHotel name:\tCheck-in:\tCheck-out:\tTravel Expense:\tAccomodation Expense:");
			for (EmployeeTravel employees : employeeTravelList) {
				System.out.println(employees.getEmployees().getEmployeeFirstName() + "\t\t"
						+ employees.getEmployees().getEmployeeLastName() + "\t"
						+ employees.getDepartments().getDepartmentName() + "\t"
						+ employees.getTravelRequests().getDestination() + "\t"
						+ employees.getTravelRequests().getTravelPurpose() + "\t"
						+ employees.getTravelRequests().getTransportationType() + "\t"
						+ employees.getTravelRequests().getStartDate() + "\t"
						+ employees.getTravelRequests().getEndDate() + "\t" + employees.getHotels().getHotelName()
						+ "\t" + employees.getAccomodations().getCheckinDate() + "\t"
						+ employees.getAccomodations().getCheckoutDate() + "\t"
						+ employees.getTravelExpenses().getTravelExpense() + "\t"
						+ employees.getAccomodations().getAccomodationExpense());
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
