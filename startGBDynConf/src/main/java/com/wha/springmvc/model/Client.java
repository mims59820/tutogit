package com.wha.springmvc.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("client")
public class Client extends Utilisateur{
	


	private String situationmatrimoniale;
	private int nbEnfant;
	
	@OneToMany(mappedBy="client")
	private Collection<Compte>comptes;
	
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	@ManyToOne(cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
	private Conseiller conseiller;
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public String getSituationmatrimoniale() {
		return situationmatrimoniale;
	}
	public void setSituationmatrimoniale(String situationmatrimoniale) {
		this.situationmatrimoniale = situationmatrimoniale;
	}
	public int getNbEnfant() {
		return nbEnfant;
	}
	public void setNbEnfant(int nbEnfant) {
		this.nbEnfant = nbEnfant;
	}
	public Client(String adresse, String situationmatrimoniale, int nbEnfant) {
		super();
		this.adresse = adresse;
		this.situationmatrimoniale = situationmatrimoniale;
		this.nbEnfant = nbEnfant;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

}
