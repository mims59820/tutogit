package com.wha.springmvc.dao;

import java.util.List;

import com.wha.springmvc.model.Compte;
import com.wha.springmvc.model.CompteDecouvert;

public interface ICompteDecouvert {
	
	public void addCompteDecouvert(CompteDecouvert c);
	public List<CompteDecouvert> listCompteDecouvert();
	public void deleteCompteDecouvert(Long id);
	public void updateCompteDecouvert(CompteDecouvert c);

}