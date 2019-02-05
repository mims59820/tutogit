package com.wha.springmvc.model;

import javax.persistence.Entity;

import org.hibernate.annotations.DiscriminatorOptions;

import javax.persistence.*;

//cration entity bbbb
@Entity(name="Utilisateur")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TypeUtilisateur", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("utilisateur")
public class Utilisateur {

	
	@Id
	@GeneratedValue
	protected int id;
	
	protected String nom;
	protected String prenom;
	protected String mail;
	protected String adresse;
	protected String telephone;
	protected String document;
	protected String pseudonyme;
	protected String mdp;
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(int id, String nom, String prenom, String mail, String adresse, String telephone,
			String document, String pseudonyme, String mdp) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.document = document;
		this.pseudonyme = pseudonyme;
		this.mdp = mdp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getPseudonyme() {
		return pseudonyme;
	}

	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
	
}
