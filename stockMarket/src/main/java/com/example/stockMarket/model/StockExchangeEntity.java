package com.example.stockMarket.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
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
public class StockExchangeEntity {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int StockExchangenid;
	
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
	
	@ManyToMany(mappedBy="StockExchangeList")
	List<CompanyEntity>CompanyList;
	
}
