package com.wha.springmvc.dao;

import java.util.List;

import com.wha.springmvc.model.Compte;

public interface ICompteDAO {
	
	public void addCompte(Compte c);
	public List<Compte> listCompte();
	public void deleteCompte(Long id);
	public void updateCompte(Compte c);

}