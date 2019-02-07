package com.boraji.tutorial.spring.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

@Entity
@DiscriminatorValue("conseiller")
public class Conseiller extends Utilisateur {

	private int matricule;
	private Date DateDebutContrat;
	
	@OneToMany(mappedBy="conseiller")
	private Collection<Client>clients;
	
	@ManyToOne(cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
	private Administrateur administrateur;
	
	public Collection<Client> getClients() {
		return clients;
	}


	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}


	public Collection<Client> getClient() {
		return clients;
	}


	public void setClient(Collection<Client> clients) {
		this.clients = clients;
	}


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