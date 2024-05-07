package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.EventsDAO;
import com.ilp03.entity.Events;

public class EventServiceImpl implements EventsService {

	@Override
	public void getEventsBasedOnSponsorshipType() {
		
		try {
			Scanner scanner = new Scanner(System.in);
			Connection connection = EventsDAO.getConnection();
			System.out.println("Enter the sponsorship type:");
			String sponsorshipType = scanner.nextLine();
			ArrayList<Events> eventsList = EventsDAO.getEventsBasedOnSponsorshipType(connection,sponsorshipType);
			System.out.println("Event Name\t\tBranch Name");
			for (Events event : eventsList) {
				System.out.println(event.getEventName()+"\t\t"+event.getBranch().getBranchName());
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
