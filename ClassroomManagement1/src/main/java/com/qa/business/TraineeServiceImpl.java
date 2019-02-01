package com.qa.business;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.TraineeService;


@Path("/Trainee")
public class TraineeServiceImpl {
	
	@Inject
	private TraineeService service;
	
	
	@Path("/getAlltrainees")
	@GET
	@Produces({ "application/json" })
	public String getAllTrainees() {
		return service.getAlltrainees();
	}
	
	@Path("/createTrainee")
	@POST
	@Produces({ "application/json" })
	public String  createTrainee(String trainee) {
		return service.createTrainee(trainee);
	}

	@Path("/deleteTrainee/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainee(@PathParam("id") Long traineeid) {
		return service.deleteTrainee(traineeid);
	}
}

}










	



	@Path("/deleteTrainer/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainer(@PathParam("id") Long classroomid) {
		return service.deleteTrainer(classroomid);
	}
	
	public void setService(ClassroomService service) {
		this.service = service;
	}

	
	
