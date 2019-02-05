package com.wha.springmvc.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("CmpteDecouvert")
public class CompteDecouvert extends Compte{

	private int decouvertAuto;
	private int tauxAgios;
	
	
	
	
	public int getDecouvertAuto() {
		return decouvertAuto;
	}
	public void setDecouvertAuto(int decouvertAuto) {
		this.decouvertAuto = decouvertAuto;
	}
	public int getTauxAgios() {
		return tauxAgios;
	}
	public void setTauxAgios(int tauxAgios) {
		this.tauxAgios = tauxAgios;
	}
	
	
}
