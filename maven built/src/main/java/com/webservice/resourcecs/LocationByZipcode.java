package com.webservice.resourcecs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.service.LocationService;

@Path("/locations")
public class LocationByZipcode {
	
	@GET
	@Path("/{zipcode}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String getLocation(@PathParam("zipcode") int zipcode) {
		LocationService location = new LocationService();
		return location.getLocation(zipcode);
		
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllLocaations() {
		return "Pass  the zipcode in url";
	}
}
