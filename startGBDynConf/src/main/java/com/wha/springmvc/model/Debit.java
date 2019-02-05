package com.wha.springmvc.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@DiscriminatorValue("D")
public class Debit extends OperationBancaire implements Serializable {
	
	public Debit(){
		super();
	}
	

}
