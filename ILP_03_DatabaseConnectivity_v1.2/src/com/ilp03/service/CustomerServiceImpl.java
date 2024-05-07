package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ilp03.dao.CustomerDAO;
import com.ilp03.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void getAllCustomers() {
		
		try {
			Connection connection = CustomerDAO.getConnection();
			ArrayList<Customer> customerList = CustomerDAO.getAllCustomers(connection);
			System.out.println("ID\tCustomer First Name\tCustomer Last Name\tAddress\tPhone Number");
			for (Customer customer : customerList) {
				System.out.println(customer.getId()+"\t"+customer.getCustomerFirstName()+"\t"+customer.getCustomerLastName()+"\t"+customer.getAddress()+"\t"+customer.getPhNumber());
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
