package com.example.stockMarket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Sectors {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column(name="Sector Name")
	private String Sector_Name;
	
	@Column
	private String Brief;
	

	@Override
		public String toString() {
		return "Sector [ "+ "Id = "+ Id+ " , Sector Name= "+
		Sector_Name + " ,Brief=  "+ Brief+ " ]";
	}
	
	

}
