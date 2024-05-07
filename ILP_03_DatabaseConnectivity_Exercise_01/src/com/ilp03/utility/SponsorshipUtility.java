package com.ilp03.utility;

import com.ilp03.service.SponsorshipService;
import com.ilp03.service.SponsorshipServiceImpl;

public class SponsorshipUtility {

	public static void main(String[] args) {
		SponsorshipService sponsorshipService = new SponsorshipServiceImpl();
		sponsorshipService.getAllSponsorships();
	}

}
