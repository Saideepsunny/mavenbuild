package com.webservice.service;

public class LocationService {
	
	public String  getLocation (int zipcode) {

			switch(zipcode) {
			case 12345:
				return "chicago";
			case 12346:
				return "illinois";
			case 12347:
				return "Texas";
			case 12348:
				return "Dallas";
			case 12349:
				return "Plano";
			case 12350:
				return "Frisco";
			default:
				return "please enter a valid zipcode";
			}
		
	}

}
