package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.AccomodationsDAO;
import com.ilp03.dao.TravelExpensesDAO;
import com.ilp03.entity.Accomodations;
import com.ilp03.entity.TravelExpenses;

public class EmployeeServiceImpl implements EmployeesService {

	@Override
	public void getTravelDataBasedOnEmployees() {

		try {
			Scanner scanner = new Scanner(System.in);
			Connection connection = AccomodationsDAO.getConnection();
			System.out.println("Enter the employee name:");
			String employeeFirstName = scanner.nextLine();
			ArrayList<TravelExpenses> employeeExpensesList = TravelExpensesDAO
					.getTravelExpenseDataBasedOnEmployees(connection, employeeFirstName);
			ArrayList<Accomodations> accomodationsList = AccomodationsDAO
					.getTravelAccomodationDataBasedOnEmployees(connection, employeeFirstName);

			System.out.println(
					"First name:\tLast Name:\tDept Name:\tDestination:\tTravel Purpose:\tTransportation Type:\tStart Date:\tEnd Date:\tHotel name:\tCheck-in:\tCheck-out:\tTravel Expense:\tAccomodation Expense:");
			for (int index = 0; index < employeeExpensesList.size(); index++) {
				TravelExpenses travelExpenses = employeeExpensesList.get(index);
				Accomodations accomodations = accomodationsList.get(index);
				System.out.println(travelExpenses.getTravelRequestID().getEmployeeID().getEmployeeFirstName() + "\t\t"
						+ travelExpenses.getTravelRequestID().getEmployeeID().getEmployeeLastName() + "\t"
						+ travelExpenses.getTravelRequestID().getEmployeeID().getDepartmentID().getDepartmentName()
						+ "\t" + travelExpenses.getTravelRequestID().getDestination() + "\t\t"
						+ travelExpenses.getTravelRequestID().getTravelPurpose() + "\t"
						+ travelExpenses.getTravelRequestID().getTransportationType() + "\t\t\t"
						+ travelExpenses.getTravelRequestID().getStartDate() + "\t"
						+ travelExpenses.getTravelRequestID().getEndDate() + "\t"
						+ accomodations.getHotelID().getHotelName() + "\t" + accomodations.getCheckinDate() + "\t\t"
						+ accomodations.getCheckoutDate() + "\t\t" + travelExpenses.getTravelExpense() + "\t"
						+ accomodations.getAccomodationExpense());
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
