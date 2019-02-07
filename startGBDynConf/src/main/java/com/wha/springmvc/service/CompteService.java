package com.wha.springmvc.service;

import java.util.List;
import com.wha.springmvc.model.Compte;

public interface CompteService {

	
	public void addCompte(Compte c);
	public List<Compte> listCompte();
	public void deleteCompte(Long id);
	public void updateCompte(Compte c);
	
}
