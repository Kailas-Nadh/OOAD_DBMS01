package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ilp03.entity.Account;
import com.ilp03.entity.Customer;
import com.ilp03.entity.Product;

public class AccountDAO {

	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/bank_db?useSSL=false";
		String userName = "root";
		String password = "Hiroshima@1945";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(connectionString, userName, password);
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

	public static ArrayList<Account> getAccountsBasedOnProductName(Connection connection, String productName) {

		ArrayList<Account> accountList = new ArrayList<Account>();
		try {
			// statement = connection.createStatement();
			PreparedStatement preparedStatement = connection.prepareStatement(
					"select * from customer inner join account on customer.customer_id=account.customer_id inner join product on product.product_id=account.product_id  where product_name=?");
			preparedStatement.setString(1, productName);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int accountID = resultSet.getInt(6);
				String accountNumber = resultSet.getString(7);

				int customerID = resultSet.getInt(1);
				String customerFirstName = resultSet.getString(2);
				String customerLastName = resultSet.getString(3);
				String address = resultSet.getString(4);
				long phNumber = resultSet.getLong(5);
				Customer customer = new Customer(customerID, customerFirstName, customerLastName, address, phNumber);

				int productID = resultSet.getInt(9);
				String fetchedProductName = resultSet.getString(11);
				Product product = new Product(productID, fetchedProductName);

				Account account = new Account(accountID, accountNumber, customer, product);


				accountList.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return accountList;

	}

}
