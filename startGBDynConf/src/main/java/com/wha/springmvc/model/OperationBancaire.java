package com.wha.springmvc.model;

import java.util.Date;
import javax.persistence.*;



@Entity(name="Op_Bancaire")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TypeOperation")
public class OperationBancaire {
	
	@Id
	@GeneratedValue
	protected int numero;
	protected double montant;
	protected Date DateVirement;
	public OperationBancaire() {
		super();
	}
	public OperationBancaire(int numero, double montant, Date dateVirement) {
		super();
		this.numero = numero;
		this.montant = montant;
		DateVirement = dateVirement;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Date getDateVirement() {
		return DateVirement;
	}
	public void setDateVirement(Date dateVirement) {
		DateVirement = dateVirement;
	}
	
	

}
