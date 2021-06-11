package com.example.stockMarket.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;






@Entity
@Table(name="company")
public class CompanyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name ="CompanyName")
	private String Company_Name; 
	
	@Column
	private int Turnover;
	
	@Column(name="CEO")
	private String CEO;
	@Column(name =" BoardofDirector")
	
	private String Board_of_Directors;

	//	@Column(name="Listed in Stock Exchange")
	//private int Listed_in_Stock_Exchange;
	
	@Column(name=" WriteUp")
	private String Write_Up;

	//	@Column(name ="Stock Code")
	//private String Stock_Code;
	
	//Relationships company and ipos
	@OneToMany(mappedBy="company", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<IPOEntity> ipos;
	
	
	//relationship between sectors and company
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "Id",insertable = false, updatable = false)
	@JsonIgnore
	private SectorEntity sector;
	
	//relationship between stockprice and company
	//@OneToMany(mappedBy="company", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //private List<StockPriceEntity> StockPrices;
	
//	public List<StockPriceEntity> getStockPrices() {
//		return StockPrices;
//	}
//
//
//
//	public void setStockPrices(List<StockPriceEntity> stockPrices) {
//		StockPrices = stockPrices;
//	}



	public String getCompany_Name() {
		return Company_Name;
	}



	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}



	public long getTurnover() {
		return Turnover;
	}



	public void setTurnover(int turnover) {
		Turnover = turnover;
	}



	public String getCEO_Name() {
		return CEO;
	}



	public void setCEO_Name(String cEO_Name) {
		CEO = cEO_Name;
	}



	public String getBoard_of_Directors() {
		return Board_of_Directors;
	}



	public void setBoard_of_Directors(String board_of_Directors) {
		Board_of_Directors = board_of_Directors;
	}



	//public int getListed_in_Stock_Exchange() {
		//return Listed_in_Stock_Exchange;
//	}



	//public void setListed_in_Stock_Exchange(int listed_in_Stock_Exchange) {
		//Listed_in_Stock_Exchange = listed_in_Stock_Exchange;
	//}



	public SectorEntity getSector() {
		return sector;
	}



	public void setSector(SectorEntity sector) {
		this.sector = sector;
	}



	public String getWrite_Up() {
		return Write_Up;
	}



	public void setWrite_Up(String write_Up) {
		Write_Up = write_Up;
	}



//	public String getStock_Code() {
//		return Stock_Code;
//	}





//	@Override
//	public String toString() {
//		return "[  Company Name = "+ Company_Name + "CEO_Name = "+ CEO_Name+ ", BOD = " + Board_of_Directors + ",Listed in Stock Exchange ="+ Listed_in_Stock_Exchange 
//				+ ", Sector = "+ Sector + ",Write Up ="+ Write_Up +", Stock Code = "+ Stock_Code     +"]" ;
//	}
	@Override
	public String toString() {
		return "[  Company Name = "+ Company_Name + "CEO_Name = "+ CEO+ ", BOD = " + Board_of_Directors  
				+ ", Sector = "+ sector + ",Write Up ="+ Write_Up   +"]" ;
	}
}
