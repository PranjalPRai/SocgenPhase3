package com.example.stockMarket.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table
public class StockExchangeEntity {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String StockExchange;
	@Column
	private String Brief;
	@Column
	private String ContactAddress;
	@Column
	private String Remarks;
	
	@OneToMany(mappedBy="stockExchange", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<IPOEntity> ipos;
	
	@OneToMany(mappedBy="StockExchange", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<StockPriceEntity> StockPrices;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStockExchange() {
		return StockExchange;
	}
	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}
	public String getBrief() {
		return Brief;
	}
	public void setBrief(String brief) {
		Brief = brief;
	}
	public String getContactAddress() {
		return ContactAddress;
	}
	public void setContactAddress(String contactAddress) {
		ContactAddress = contactAddress;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
}
