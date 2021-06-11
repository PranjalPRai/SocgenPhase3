package com.example.stockMarket.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table
public class SectorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@Column(name="Sector_Name")
	private String SectorName;
	
	@Column
	private String Brief;
	@OneToMany(mappedBy="sector", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CompanyEntity> companies;

	public String getSectorName() {
		return SectorName;
	}


	public void setSectorName(String sectorName) {
		SectorName = sectorName;
	}


	public String getBrief() {
		return Brief;
	}


	public void setBrief(String brief) {
		Brief = brief;
	}


	@Override
		public String toString() {
		return "Sector [ "+ "Id = "+ Id+ " , Sector Name= "+
		SectorName + " ,Brief=  "+ Brief+ " ]";
	}
	
	

}
