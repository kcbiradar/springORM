package com.spring.orm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name= "Shop_Details")
public class Store {
	@Id
	@Column(name = "shopID")
	private int shopID;
	@Column(name = "shopName")
	private String shopName;
	@Column(name = "city")
	private String city;
	
	public int getShopID() {
		return shopID;
	}
	public void setShopID(int shopID) {
		this.shopID = shopID;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Store() {
		super();
	}
	public Store(int shopID , String shopName , String city) {
		this.shopID = shopID;
		this.shopName = shopName;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Shop details as follows : " + 
				"Name : " + shopName + "\n" + 
				"Shop Id : " + shopID + "\n" + 
				"City : " + city + "\n";
	} 
	
}
