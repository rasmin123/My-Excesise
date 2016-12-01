package com.hib.mapping;

import java.util.Set;

public class Vendor {
	private int vendorId;
	private String vendorName;
	private Set<Customer> cusid;
	
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Set<Customer> getCusid() {
		return cusid;
	}
	public void setCusid(Set<Customer> cusid) {
		this.cusid = cusid;
	}
	

}
