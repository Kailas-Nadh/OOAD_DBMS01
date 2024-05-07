package com.ilp03.utility;

import com.ilp03.service.EventServiceImpl;
import com.ilp03.service.EventsService;

public class EventsUtility {

	public static void main(String[] args) {
		EventsService eventsService = new EventServiceImpl();
		eventsService.getEventsBasedOnSponsorshipType();
		
	}

}
