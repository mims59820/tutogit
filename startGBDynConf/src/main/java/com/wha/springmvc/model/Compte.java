package com.wha.springmvc.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Compte implements Serializable{

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int Identifiant;
	private int NumeroCompte;
	private String typeCompte;
	private Date dateCreation;
	private int Solde;

	public Collection<OperationBancaire> getOperations() {
		return operations;
	}
	public void setOperations(Collection<OperationBancaire> operations) {
		this.operations = operations;
	}
	private int RIB;
	@OneToMany(mappedBy="compte")
	private Collection<OperationBancaire> operations;
	
	@ManyToOne(cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
	private Client client;
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public int getIdentifiant() {
		return Identifiant;
	}
	public void setIdentifiant(int identifiant) {
		Identifiant = identifiant;
	}
	public int getNumeroCompte() {
		return NumeroCompte;
	}
	public void setNumeroCompte(int numeroCompte) {
		NumeroCompte = numeroCompte;
	}
	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public int getSolde() {
		return Solde;
	}
	public void setSolde(int solde) {
		Solde = solde;
	}
	public int getRIB() {
		return RIB;
	}
	public void setRIB(int rIB) {
		RIB = rIB;
	}
	
	
	
	
}