package com.ilp03.utility;

import com.ilp03.service.EmployeeServiceImpl;
import com.ilp03.service.EmployeesService;

public class EmployeeTravelUtility {

	public static void main(String[] args) {
		EmployeesService employeeService = new EmployeeServiceImpl();
		employeeService.getTravelDataBasedOnEmployees();

	}

}
