package com.wha.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.wha.springmvc.model.Conseiller;

public class ConseillerDaoImpl implements IConseillerDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addConseiller(Conseiller c) {

		entityManager.persist(c);
		
	}

	@Override
	public List<Conseiller> listConseillers() {

		Query req=entityManager.createQuery("select c from Conseiller c");
		return req.getResultList();
	}

	@Override
	public void deleteConseiller(Long id) {

		Conseiller c = entityManager.find(Conseiller.class, id);
		entityManager.remove(c);
		
	}

	@Override
	public void updateConseiller(Conseiller c) {

		entityManager.merge(c);
		
	}

}
