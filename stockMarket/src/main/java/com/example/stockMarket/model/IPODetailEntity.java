package com.example.stockMarket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IPO Detail")
public class IPODetailEntity {
	  
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="Company Name")
	private String Company_Name;
	
	@Column(name="Stock Exchange")
	private double Stock_Exchange;
	
	@Column(name="Price Per Share")
	 private double Price_per_Share;
	
	@Column(name ="Total number of Shares")
	private long Total_Number_of_Shares;
	
	@Column(name ="Open Date Time")
	private String Open_Date_Time;
	
	 @Column
	 private String Remarks;
	 
	 
	 public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCompany_Name() {
		return Company_Name;
	}


	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}


	public double getStock_Exchange() {
		return Stock_Exchange;
	}


	public void setStock_Exchange(double stock_Exchange) {
		Stock_Exchange = stock_Exchange;
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


	public String getOpen_Date_Time() {
		return Open_Date_Time;
	}


	public void setOpen_Date_Time(String open_Date_Time) {
		Open_Date_Time = open_Date_Time;
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
					" ,Stock Exchange = "+ Stock_Exchange+ " ,Price Per Share ="
							+ Price_per_Share+ ", Total number of Shares = "+ Total_Number_of_Shares+ 
							" , Open Date Time ="+ Open_Date_Time+ " , Remarks= "+ Remarks +"]";
		}
	
	
	

}
