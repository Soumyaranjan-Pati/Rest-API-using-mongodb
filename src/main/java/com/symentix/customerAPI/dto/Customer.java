package com.symentix.customerAPI.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
@Id
private int custId;
private String custName;
private String productName;
private int productPrice;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int custId, String custName, String productName, int productPrice) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.productName = productName;
	this.productPrice = productPrice;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}

}
