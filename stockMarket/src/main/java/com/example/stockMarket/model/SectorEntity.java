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
public class SectorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Sectroid;
	
	@Column(name="Sector_Name")
	private String SectorName;
	
	@Column
	private String Brief;
	@OneToMany(mappedBy="sector", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CompanyEntity> companies;

	private String Sectorid;

	

	@Override
		public String toString() {
		return "Sector [ "+ "Id = "+ Sectorid+ " , Sector Name= "+
		getSectorName() + " ,Brief=  "+ Brief+ " ]";
	}



	public String getSectorName() {
		return SectorName;
	}



	public void setSectorName(String sectorName) {
		SectorName = sectorName;
	}
	
	

}
