package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ilp03.entity.Customer;

public class CustomerDAO {

	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/bank_db?useSSL=false";
		String userName = "root";
		String password = "Hiroshima@1945";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(connectionString,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Customer> getAllCustomers(Connection connection) {
		Statement statement;
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from customer");
			while(resultSet.next()) {
				int id = resultSet.getInt(1);
				String customerFirstName = resultSet.getString(2);
				String customerLastName = resultSet.getString(3);
				String address = resultSet.getString(4);
				long phNumber = resultSet.getLong(5);
				
				Customer customer = new Customer(id,customerFirstName,customerLastName,address,phNumber);
				customerList.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customerList;
		
	}

}
