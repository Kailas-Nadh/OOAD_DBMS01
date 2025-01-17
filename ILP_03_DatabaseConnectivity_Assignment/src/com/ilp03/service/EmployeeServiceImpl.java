package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.EmployeesDAO;
import com.ilp03.entity.Employees;

public class EmployeeServiceImpl implements EmployeesService {

	@Override
	public void getTravelDataBasedOnEmployees() {
		
		try {
			Scanner scanner = new Scanner(System.in);
			Connection connection = EmployeesDAO.getConnection();
			System.out.println("Enter the employee name:");
			String employeeFirstName = scanner.nextLine();
			ArrayList<Employees> employeesList = EmployeesDAO.getTravelDataBasedOnEmployees(connection,employeeFirstName);
			System.out.println("First name:\tLast Name:\tDept Name:\tDestination:\tTravel Purpose:\tTransportation Type:\tStart Date:\tEnd Date:\tHotel name:\tCheck-in:\tCheck-out:\tTravel Expense:\tAccomodation Expense:");
			for (Employees employees : employeesList) {
				System.out.println(employees.getEmployeeFirstName()+"\t\t"+employees.getEmployeeLastName()+"\t"+employees.getDepartmentID().getDepartmentName()+"\t");
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

}
