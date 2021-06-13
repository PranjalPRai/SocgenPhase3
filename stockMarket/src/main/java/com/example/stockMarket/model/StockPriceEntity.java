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
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "Companyid")
	@JsonIgnore
	private CompanyEntity company;
	
	@Column(name=" StockExchange")
	private String StockExchange;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "StockExchangeid",insertable = false, updatable = false)
	@JsonIgnore
	private StockExchangeEntity stockExchange;
	 @Column(name="CurrentPrice")
	private double Current_Price;
	@Column
	private String Date;
	@Column
	private String Time;
	
	
	







	@Override
	public String toString()
	{
		return "[ Company Code ="+ ",Stock Exchange = "+StockExchange+
				",Current Price = "+ Current_Price+ ", Date = "+ Date+", Time= "+ Time+ "]";
		
	}
	
	

}
