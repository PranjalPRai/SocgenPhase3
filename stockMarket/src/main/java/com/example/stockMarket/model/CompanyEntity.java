package com.example.stockMarket.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="company")
public class CompanyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name ="Company Name")
	private String Company_Name; 
	@Column
	private long Turnover;
	@Column(name="CEO")
	private String CEO;
	@Column(name =" Board of Director")
	private String[] Board_of_Directors;
//	@Column(name="Listed in Stock Excahnge")
//	private int Listed_in_Stock_Exchange;
	@Column(name =" Sector")
	private String Sector;
	@Column(name=" Write Up")
	private String Write_Up;
//	@Column(name ="Stock Code")
	//private String Stock_Code;
	
	
	
	public String getCompany_Name() {
		return Company_Name;
	}



	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}



	public long getTurnover() {
		return Turnover;
	}



	public void setTurnover(long turnover) {
		Turnover = turnover;
	}



	public String getCEO_Name() {
		return CEO;
	}



	public void setCEO_Name(String cEO_Name) {
		CEO = cEO_Name;
	}



	public String[] getBoard_of_Directors() {
		return Board_of_Directors;
	}



	public void setBoard_of_Directors(String[] board_of_Directors) {
		Board_of_Directors = board_of_Directors;
	}



	//public int getListed_in_Stock_Exchange() {
		//return Listed_in_Stock_Exchange;
//	}



	//public void setListed_in_Stock_Exchange(int listed_in_Stock_Exchange) {
		//Listed_in_Stock_Exchange = listed_in_Stock_Exchange;
	//}



	public String getSector() {
		return Sector;
	}



	public void setSector(String sector) {
		Sector = sector;
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
				+ ", Sector = "+ Sector + ",Write Up ="+ Write_Up   +"]" ;
	}
}
