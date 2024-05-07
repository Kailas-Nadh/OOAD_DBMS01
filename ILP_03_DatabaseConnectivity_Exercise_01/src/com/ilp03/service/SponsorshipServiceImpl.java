package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ilp03.dao.SponsorshipDAO;
import com.ilp03.entity.Sponsorship;

public class SponsorshipServiceImpl implements SponsorshipService {

	@Override
	public void getAllSponsorships() {

		try {
			Connection connection = SponsorshipDAO.getConnection();
			ArrayList<Sponsorship> sponsorshipList = SponsorshipDAO.getAllSponsorships(connection);
			System.out.println("ID\tCollege Name\tCollege Place\tPhone Number\tSponsorship Amount");
			for (Sponsorship sponsorship : sponsorshipList) {
				System.out.println(sponsorship.getId() + "\t" + sponsorship.getCollegeName() + "\t\t"
						+ sponsorship.getCollegePlace() + "\t" + sponsorship.getPhNumber() + "\t"
						+ sponsorship.getSponsorshipAmount());
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
