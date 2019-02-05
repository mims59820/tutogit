package com.wha.springmvc.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@DiscriminatorValue("Conseiller")
public class Conseiller extends Utilisateur implements Serializable {

	private int matricule;
	private Date DateDebutContrat;
	
	public Conseiller() {
		super();
		
	}
	

	public Conseiller(int matricule, Date dateDebutContrat) {
		this.matricule = matricule;
		DateDebutContrat = dateDebutContrat;
	}


	public int getMatricule() {
		return matricule;
	}


	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}


	public Date getDateDebutContrat() {
		return DateDebutContrat;
	}


	public void setDateDebutContrat(Date dateDebutContrat) {
		DateDebutContrat = dateDebutContrat;
	}
	
	
	
	
}
