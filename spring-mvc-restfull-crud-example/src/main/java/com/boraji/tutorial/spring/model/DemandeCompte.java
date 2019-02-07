package com.boraji.tutorial.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//jbj
@Entity
public class DemandeCompte {
	@Id @GeneratedValue
	private int id;
	private String nom;
	private String prenom;
	private String adress;
	private String mail;
	private int tel;
	@ManyToOne(cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
    private Administrateur administrateur;
	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}

	public DemandeCompte() {

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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public DemandeCompte(String nom, String prenom, String adress, String mail, int tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.mail = mail;
		this.tel = tel;
	}

}
