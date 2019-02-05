package com.wha.springmvc.model;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur extends Utilisateur {
	
	
	@OneToMany(mappedBy="administrateur")
	private Collection<Conseiller>conseillers;
	@OneToMany(mappedBy="administrateur")
	private Collection<DemandeCompte> demandes;

	public Collection<DemandeCompte> getDemandes() {
		return demandes;
	}

	public void setDemandes(Collection<DemandeCompte> demandes) {
		this.demandes = demandes;
	}

	public Administrateur() {
		super();
	}

	public Collection<Conseiller> getConseillers() {
		return conseillers;
	}

	public void setConseillers(Collection<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}
	

}
