package com.wha.springmvc.model;

import java.io.Serializable;
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
	private int RIB;
	
	
	//test du commit
	//deuxieme commit test
	//troisieme commit de mims
	//test sofiane
	
	
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
