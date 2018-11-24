package com.jkim176.project1.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDERLINE")
public class OrderLine {
	
	@Id
	@Column(name="ORDERLINE_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="ORDER_ID")
	private long orderId;
	@Column(name="PRODUCT_ID")
	private long productId;
	@Column(name="QUANTITY")
	private long quantity;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getOrderId() {
		return orderId;
	}
	
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	public long getProductid() {
		return productId;
	}
	
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	public long getQuantity() {
		return quantity;
	}
	
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
}
