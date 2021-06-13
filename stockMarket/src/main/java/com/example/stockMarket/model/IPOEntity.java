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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="IPO")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IPOEntity {
	  
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IPOid;
	@Column(name="CompanyName")
	private String Company_Name;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "StockExchangeid",insertable = false, updatable = false)
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
		@JoinColumn(name = "Companyid" ,insertable = false, updatable = false)
		@JsonIgnore
		private CompanyEntity company;
	 
	

	@Override
		public String toString() {
			return "IPO [ id ="+IPOid+ " , Company Name= "+ Company_Name+
					" ,Stock Exchange = "+ stockExchange+ " ,Price Per Share ="
							+ Price_per_Share+ ", Total number of Shares = "+ Total_Number_of_Shares+ 
							" , Open Date Time ="+ openDateTime+ " , Remarks= "+ Remarks +"]";
		}
	
	
	

}
