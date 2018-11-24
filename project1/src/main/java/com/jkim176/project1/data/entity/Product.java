package com.jkim176.project1.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {

	@Id
	@Column(name="PRODUCT_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="MANUFACTURER_ID")
	private long manufacturerId;
	@Column(name="PRODUCT_NAME")
	private String name;
	@Column(name="PRODUCT_DESCRIPTION")
	private String description;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getManufacturerId() {
		return manufacturerId;
	}
	
	public void setManufacturerId(long manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
