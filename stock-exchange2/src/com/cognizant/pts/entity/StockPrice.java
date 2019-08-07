package com.cognizant.pts.entity;

import java.sql.Date;
import java.sql.Time;

import entity.Column;

@Entity
@Table(name="stockprice")
public class StockPrice {

	@Column(name="company_code")
	private String companyCode;
	
	@Column(name="stock_exchange")
	private String stockExchange;
	
	@Column(name="current_price")
	private double currentPrice;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="time")
	private Time time;

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
}
