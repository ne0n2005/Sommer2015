package de.tobias.pizza.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("message")
public class App {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String message() {
		return "Yea! ";
	}
}