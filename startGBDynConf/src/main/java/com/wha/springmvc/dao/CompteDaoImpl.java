package com.wha.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.wha.springmvc.model.Compte;
@Repository
@Transactional
public class CompteDaoImpl implements ICompteDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addCompte(Compte c) {

		entityManager.persist(c);
		
	}

	@Override
	public List<Compte> listCompte() {

		Query req=entityManager.createQuery("select c from Compte c");
		return req.getResultList();
	}

	@Override
	public void deleteCompte(Long id) {

		Compte c = entityManager.find(Compte.class, id);
		entityManager.remove(c);
		
	}

	@Override
	public void updateCompte(Compte c) {

		entityManager.merge(c);
		
	}

}
