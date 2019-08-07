package com.cognizant.pts.entity;

@Entity
@Table(name="stockexchange")
public class StockExchange {

	@Column(name="id")
	private String stockexchange_id;
	
	@Column(name="stock_exchange")
	private String stockExchange;
	
	@Column(name="brief")
	private String brief;
	
	@Column(name="contact_address")
	private String contactAddress;
	
	@Column(name="remarks")
    private String remarks;

	public String getStockexchange_id() {
		return stockexchange_id;
	}

	public void setStockexchange_id(String stockexchange_id) {
		this.stockexchange_id = stockexchange_id;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
