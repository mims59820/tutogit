package com.wha.springmvc.dao;

import java.util.List;

import com.wha.springmvc.model.Conseiller;



public interface IConseillerDAO {
	
	public void addConseiller(Conseiller c);
	public List<Conseiller> listConseillers();
	public void deleteConseiller(Long id);
	public void updateConseiller(Conseiller c);

}
