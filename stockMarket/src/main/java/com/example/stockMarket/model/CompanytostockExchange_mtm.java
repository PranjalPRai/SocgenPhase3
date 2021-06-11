package com.example.stockMarket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CompanytostockExchange_mtm {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

 
 
  // private CompanyEntity 
 //has to be 2 one to one relatioship 
 private int Companyid;
 private int stockexchangeid;
 private int companycode;
}
