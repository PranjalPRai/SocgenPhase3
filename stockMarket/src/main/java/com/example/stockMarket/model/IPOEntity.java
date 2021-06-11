package com.example.stockMarket.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="IPO")
public class IPOEntity {
	  
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="CompanyName")
	private String Company_Name;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id",insertable = false, updatable = false)
	@JsonIgnore
	private StockExchangeEntity stockExchange;
	
	@Column(name="PricePerShare")
	 private double Price_per_Share;
	
	@Column(name ="TotalnumberofShares")
	private long Total_Number_of_Shares;
	
	@Column(name ="OpenDateTime",nullable=false)
	private Timestamp openDateTime;
	
	 @Column
	 private String Remarks;
	 
	 
	 //relationship between ipos and company
 @ManyToOne(fetch = FetchType.LAZY, optional = false)
		@JoinColumn(name = "id" ,insertable = false, updatable = false)
		@JsonIgnore
		private CompanyEntity company;
	 
	 public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCompany_Name() {
		return Company_Name;
	}


	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}


	public double getStock_Exchange() {
		return getStock_Exchange();
	}


	public void setStock_Exchange(StockExchangeEntity stock_Exchange) {
		stockExchange = stock_Exchange;
	}


	public double getPrice_per_Share() {
		return Price_per_Share;
	}


	public void setPrice_per_Share(double price_per_Share) {
		Price_per_Share = price_per_Share;
	}


	public long getTotal_Number_of_Shares() {
		return Total_Number_of_Shares;
	}


	public void setTotal_Number_of_Shares(long total_Number_of_Shares) {
		Total_Number_of_Shares = total_Number_of_Shares;
	}


	public Timestamp getOpen_Date_Time() {
		return openDateTime;
	}


	public void setOpen_Date_Time(Timestamp open_Date_Time) {
		openDateTime = open_Date_Time;
	}


	public String getRemarks() {
		return Remarks;
	}


	public void setRemarks(String remarks) {
		Remarks = remarks;
	}


	@Override
		public String toString() {
			return "IPO [ id ="+id+ " , Company Name= "+ Company_Name+
					" ,Stock Exchange = "+ stockExchange+ " ,Price Per Share ="
							+ Price_per_Share+ ", Total number of Shares = "+ Total_Number_of_Shares+ 
							" , Open Date Time ="+ openDateTime+ " , Remarks= "+ Remarks +"]";
		}
	
	
	

}
