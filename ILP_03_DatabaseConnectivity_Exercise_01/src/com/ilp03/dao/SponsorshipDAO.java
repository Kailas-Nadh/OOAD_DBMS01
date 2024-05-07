package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ilp03.entity.Sponsorship;

public class SponsorshipDAO {

	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/team4bank_db?useSSL=false";
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

	public static ArrayList<Sponsorship> getAllSponsorships(Connection connection) {
		Statement statement;
		ArrayList<Sponsorship> sponsorshipList = new ArrayList<Sponsorship>();

		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from sponsorship");
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String collegeName = resultSet.getString(2);
				String collegePlace = resultSet.getString(3);
				long phNumber = resultSet.getLong(4);
				int sponsorshipAmount = resultSet.getInt(5);

				Sponsorship sponsorship = new Sponsorship(id, collegeName, collegePlace, phNumber, sponsorshipAmount);
				sponsorshipList.add(sponsorship);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sponsorshipList;

	}

}
