package com.qa.business;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.TraineeService;
import com.qa.persistance.repository.ClassroomRepository;
import com.qa.persistance.repository.TraineeRepository;



public class TraineeServiceImpl implements TraineeService{
	
	@Inject
	private TraineeRepository repo;
	
	public String getAlltrainees() {
		return repo.getAlltrainees();
	}
	
	public String createTrainee(String trainee) {
		return repo.createTrainee(trainee);
	}
	
	public String deleteTrainee(Long traineeid) {
		return repo.deleteTrainee(traineeid);
}

	
	
}


	
	
