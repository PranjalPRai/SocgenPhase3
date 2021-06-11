/** 
 * 
 */
package com.example.stockMarket.model;

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

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table (name="StockPrice")
public class StockPriceEntity {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "id",insertable = false, updatable = false)
//	@JsonIgnore
//	private CompanyEntity company;
//	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "company_id")
	@JsonIgnore
	private CompanyEntity company;
	
	@Column(name=" StockExchange")
	private String StockExchange;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id",insertable = false, updatable = false)
	@JsonIgnore
	private StockExchangeEntity stockExchange;
	 @Column(name="CurrentPrice")
	private double Current_Price;
	@Column
	private String Date;
	@Column
	private String Time;
	
	
	





	public String getStock_Exchange() {
		return getStock_Exchange();
	}




	public void setStock_Exchange(String stock_Exchange) {
		StockExchange = stock_Exchange;
	}




	public double getCurrent_Price() {
		return Current_Price;
	}




	public void setCurrent_Price(double current_Price) {
		Current_Price = current_Price;
	}




	public String getDate() {
		return Date;
	}




	public void setDate(String date) {
		Date = date;
	}




	public String getTime() {
		return Time;
	}




	public void setTime(String time) {
		Time = time;
	}




	@Override
	public String toString()
	{
		return "[ Company Code ="+ ",Stock Exchange = "+StockExchange+
				",Current Price = "+ Current_Price+ ", Date = "+ Date+", Time= "+ Time+ "]";
		
	}
	
	

}
