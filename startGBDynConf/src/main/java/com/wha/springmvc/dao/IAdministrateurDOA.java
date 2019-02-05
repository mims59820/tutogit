package com.wha.springmvc.dao;

import java.util.Collection;

import com.wha.springmvc.model.Administrateur;

public interface IAdministrateurDOA {

	
	//Administrateur findAdministrateurById(int Id);
	//Administrateur findAdministrateurByName(String name);
	Collection<Administrateur> findAllAdministrateur();
	
	void createAdministrateur(Administrateur admin);
	void deleteAdministrateur(Administrateur admin);
	void updateAdministrateur (Administrateur admin);
	
	
	
}
