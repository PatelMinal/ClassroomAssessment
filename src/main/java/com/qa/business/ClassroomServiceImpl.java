package com.qa.business;

import javax.inject.Inject;

import com.qa.persistance.repository.ClassroomRepository;


public class ClassroomServiceImpl implements ClassroomService {
	
	@Inject
	private ClassroomRepository repo;
	
	public String getAlltrainers() {
		return repo.getAlltrainers();
	}
	
	public String createTrainer(String trainer) {
		return repo.createTrainer(trainer);
	}
	
	public String deleteTrainer(Long classroomid) {
		return repo.deleteTrainer(classroomid);
}
	
}