package com.wha.springmvc.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.*;

@Entity
@DiscriminatorValue("Compte Remun")
public class Compteremun extends Compte{
	
	private int tauxRemun;
	private int seuilMini;
	
	
	public int getTauxRemun() {
		return tauxRemun;
	}
	public void setTauxRemun(int tauxRemun) {
		this.tauxRemun = tauxRemun;
	}
	public int getSeuilMini() {
		return seuilMini;
	}
	public void setSeuilMini(int seuilMini) {
		this.seuilMini = seuilMini;
	}

	
	
}
