/** 
 * 
 */
package com.example.stockMarket.model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author ASUS
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.crypto.Data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table (name="StockPrice")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StockPriceEntity {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int StorckPriceid;
	
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "id",insertable = false, updatable = false)
//	@JsonIgnore
//	private CompanyEntity company;
//	
//	
//	@ManyToOne(fetch = FetchType.LAZY, optional = true)
//	@JoinColumn(name = "Companyid")
//	@JsonIgnore
//	private CompanyEntity company;
	
	@Column(name=" StockExchange")
	private String StockExchange;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "StockExchangeid",insertable = true, updatable = false)
	@JsonIgnore
	private StockExchangeEntity stockExchangeent;
	 @Column(name="CurrentPrice")
	private double Current_Price;
	@Column
	private LocalDate date;
	@Column
	private LocalTime time;
	
	
	@Column
   private  int companyCode;
















	public int getCompanyCode() {
		return companyCode;
	}










	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}


















	public LocalTime getTime() {
		return time;
	}










	public void setTime(LocalTime time) {
		this.time = time;
	}










	public LocalDate getDate() {
		return date;
	}










	public void setDate(LocalDate date) {
		this.date = date;
	}










	








	public int getStorckPriceid() {
		return StorckPriceid;
	}










	public void setStorckPriceid(int storckPriceid) {
		StorckPriceid = storckPriceid;
	}










//	public CompanyEntity getCompany() {
//		return company;
//	}
//
//
//
//
//
//
//
//
//
//
//	public void setCompany(CompanyEntity company) {
//		this.company = company;
//	}










	public String getStockExchange() {
		return StockExchange;
	}










	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}










	public StockExchangeEntity getStockExchangeent() {
		return stockExchangeent;
	}










	public void setStockExchangeent(StockExchangeEntity stockExchangeent) {
		this.stockExchangeent = stockExchangeent;
	}










	public double getCurrent_Price() {
		return Current_Price;
	}










	public void setCurrent_Price(double current_Price) {
		Current_Price = current_Price;
	}































	public StockPriceEntity() {
		super();
	}










	public StockPriceEntity(int storckPriceid, String stockExchange, double current_Price, String date, String time) {
		super();
		StorckPriceid = storckPriceid;
		StockExchange = stockExchange;
		Current_Price = current_Price;
		date = date;
		time = time;
	}










	@Override
	public String toString()
	{
		return "[ Company Code ="+ ",Stock Exchange = "+StockExchange+
				",Current Price = "+ Current_Price+ ", Date = "+ date+", Time= "+ time+ "]";
		
	}
	
	

}
