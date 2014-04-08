package edu.neu.db.rest.experiments;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/json")
public class Json {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee GetEmployee() {
		Employee alice = new Employee("Alice", "Wonderland123", 225000);
		return alice;
	}
}
