package com.cognizant.pts.model;

public class IOPDetailsModel {

	private String iopdetails_Id;
	private String companyName;
	private String stockExchange;
	private long pricePerShare;
	private String openDateTime;
	private String remarks;
	public String getIopdetails_Id() {
		return iopdetails_Id;
	}
	public void setIopdetails_Id(String iopdetails_Id) {
		this.iopdetails_Id = iopdetails_Id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public long getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(long pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public String getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
