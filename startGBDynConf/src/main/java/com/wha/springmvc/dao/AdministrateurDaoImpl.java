package com.wha.springmvc.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.springmvc.model.Administrateur;
import com.wha.springmvc.model.Conseiller;
@Repository
@Transactional
public class AdministrateurDaoImpl implements IAdministrateurDOA {
	

	@PersistenceContext
	private EntityManager em;
			

	//@Override
	//public Administrateur findAdministrateurById(int Id) {
	//	Query req=em.createQuery("Select a from Administrateur a where administrateur.id="+Id);
	//	return (Administrateur) req.getSingleResult();
	//}

	//@Override
	//public Administrateur findAdministrateurByName(String name) {
	//	 Query req=em.createQuery("Select a from administrateur a where administrateur.nom="+name);
	//	return (Administrateur) req.getSingleResult();
	//}

	@Override
	public Collection<Administrateur> findAllAdministrateur() {
		Query req=em.createQuery("select a from administrateur a");
		return req.getResultList();
	}

	@Override
	public void createAdministrateur(Administrateur admin) {
		em.persist(admin);

	}

	@Override
	public void deleteAdministrateur(Administrateur admin) {
		em.remove(admin);

	}

	@Override
	public void updateAdministrateur(Administrateur admin) {
		em.merge(admin);

	}

}
