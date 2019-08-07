package com.cognizant.pts.entity;

@Entity
@Table(name="iopdetails")
public class IOPDetails {

	@Column(name="id")
	private String iopdetails_Id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="stock_exchange")
	private String stockExchange;
	
	@Column(name="price_per_share")
	private long pricePerShare;
	
	@Column(name="open_date_time")
	private String openDateTime;
	
	@Column(name="remarks")
	private String remarks;

	public String getiopdetails_Id() {
		return iopdetails_Id;
	}

	public void setiopdetails_Id(String id) {
		iopdetails_Id= id;
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
