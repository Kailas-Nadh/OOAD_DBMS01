package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.AccountDAO;
import com.ilp03.entity.Account;

public class AccountServiceImpl implements AccountService {

	@Override
	public void getAccountsBasedOnProductName() {
		
		try {
			Scanner scanner = new Scanner(System.in);
			Connection connection = AccountDAO.getConnection();
			System.out.println("Enter the type of account:");
			String accountType = scanner.nextLine();
			ArrayList<Account> accountList = AccountDAO.getAccountsBasedOnProductName(connection,accountType);
			System.out.println("Account Number\tCustomer Name");
			for (Account account : accountList) {
				System.out.println(account.getAccountNumber()+"\t"+account.getCustomer().getCustomerFirstName());
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
