package com.src.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customercrud")
public class Customer {
	@Id
	private int customerid;
	@Column(name="cmobilenum")
	private double customermobileno;
	@Column(name="cname")
	private String customername;
	@Column(name="cemail")
	private String customeremail;
	
	@Override
	public String toString() {
		return "customer [customerid=" + customerid + ", customermobileno=" + customermobileno + ", customername="
				+ customername + ", customeremail=" + customeremail + "]";
	}

	
	public Customer(int customerid) {
		super();
		this.customerid = customerid;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerid, double customermobileno, String customername, String customeremail) {
		super();
		this.customerid = customerid;
		this.customermobileno = customermobileno;
		this.customername = customername;
		this.customeremail = customeremail;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public double getCustomermobileno() {
		return customermobileno;
	}
	public void setCustomermobileno(double customermobileno) {
		this.customermobileno = customermobileno;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomeremail() {
		return customeremail;
	}
	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}
	
	
	
}
