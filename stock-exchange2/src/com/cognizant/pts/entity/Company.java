package com.cognizant.pts.entity;


@Entity
@Table(name="company")


public class Company {

	@Column(name="company_name")
	private String companyName;
	
	@Column(name="turnover")
	private double turnover;
	
	@Column(name="CEO")
	private String CEO;
	
	@Column(name="directors")
	private String boardDdirectors;
	
	@Column(name="stock_exchanges")
	private String stockExchanges;
	
	@Column(name="sector")
	private String sector;
	
	@Column(name="brief_writeup")
	private String briefWriteup;
	
	@Column(name="stock_code")
	private String stockCode;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public String getCEO() {
		return CEO;
	}

	public void setCEO(String cEO) {
		CEO = cEO;
	}

	public String getBoardDdirectors() {
		return boardDdirectors;
	}

	public void setBoardDdirectors(String boardDdirectors) {
		this.boardDdirectors = boardDdirectors;
	}

	public String getStockExchanges() {
		return stockExchanges;
	}

	public void setStockExchanges(String stockExchanges) {
		this.stockExchanges = stockExchanges;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getBriefWriteup() {
		return briefWriteup;
	}

	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	
	
}
