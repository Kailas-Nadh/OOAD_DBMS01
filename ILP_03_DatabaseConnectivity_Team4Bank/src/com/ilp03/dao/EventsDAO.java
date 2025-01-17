package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ilp03.entity.Branch;
import com.ilp03.entity.Events;
import com.ilp03.entity.Sponsorship;

public class EventsDAO {

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

	public static ArrayList<Events> getEventsBasedOnSponsorshipType(Connection connection, String sponsorshipType) {

		ArrayList<Events> eventsList = new ArrayList<Events>();
		try {
			// statement = connection.createStatement();
			PreparedStatement preparedStatement = connection.prepareStatement(
					"select * from branch inner join events on branch.id=events.branch_id inner join sponsorship on sponsorship.id=events.sponsorship_id  where sponsorship_type=?");
			preparedStatement.setString(1, sponsorshipType);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int eventsID = resultSet.getInt(6);
				String eventName = resultSet.getString(7);

				int branchID = resultSet.getInt(1);
				String branchCode = resultSet.getString(2);
				String branchName = resultSet.getString(3);
				String branchManagerName = resultSet.getString(4);
				long phNumber = resultSet.getLong(5);
				Branch branch = new Branch(branchID, branchCode, branchName, branchManagerName, phNumber);

				int sponsorshipID = resultSet.getInt(9);
				String fetchedSponsorshipType = resultSet.getString(11);
				int sponsorshipAmount = resultSet.getInt(12);
				Sponsorship sponsorship = new Sponsorship(sponsorshipID, fetchedSponsorshipType,sponsorshipAmount);

				Events event = new Events(eventsID, eventName, branch,sponsorship);


				eventsList.add(event);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return eventsList;

	}

}
