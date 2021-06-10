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
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Stock Price")
public class StockPriceEntity {
	@Id
	@Column(name ="Company Code")
	private long Company_Code;
	@Column(name=" Stock Exchange")
	private double Stock_Exchange;
	 @Column(name="Current Price")
	private double Current_Price;
	@Column
	private String Date;
	@Column
	private String Time;
	
	
	

	public long getCompany_Code() {
		return Company_Code;
	}




	public void setCompany_Code(long company_Code) {
		Company_Code = company_Code;
	}




	public double getStock_Exchange() {
		return Stock_Exchange;
	}




	public void setStock_Exchange(double stock_Exchange) {
		Stock_Exchange = stock_Exchange;
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
		return "[ Company Code ="+ Company_Code+ ",Stock Exchange = "+Stock_Exchange+
				",Current Price = "+ Current_Price+ ", Date = "+ Date+", Time= "+ Time+ "]";
		
	}
	
	

}
