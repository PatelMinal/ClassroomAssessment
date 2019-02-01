package com.qa.persistance.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import com.qa.persistance.domain.Trainee;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TraineeDBRepository implements TraineeRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Transactional(REQUIRED)
	public String getAlltrainees() {
		Query query = manager.createQuery("SELECT a from Trainees a", Trainee.class);
		Collection<Trainee> trainees = (Collection<Trainee>) query.getResultList();
		return util.getJSONForObject(query);
	}

	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainee atrainee = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(atrainee);
		return "{\"Message\": \"Trainee Sucessfully Added\"}";
	}

	public String deleteTrainee(Long traineeid) {
		Trainee traineeDB = findatrainee(traineeid);
		if (traineeDB != null) {
			manager.remove(traineeDB);
		}
		return "{\"Message\": \"Trainee Sucessfully Removed\"}";
	}

	private Trainee findatrainee(Long traineeid) {
		return manager.find(Trainee.class, traineeid);
	}

	public String updateTrainee(Long traineeid, String trainee) {
		// TODO Auto-generated method stub
		return null;
	}

}