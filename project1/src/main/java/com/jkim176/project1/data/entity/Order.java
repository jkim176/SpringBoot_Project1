package com.jkim176.project1.data.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER")
public class Order {

	@Id
	@Column(name="ORDER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="CUSTOMER_ID")
	private long customerId;
	@Column(name="DATE_ORDERED")
	private Date dateOrdered;
	@Column(name="DATE_SHIPPED")
	private Date dateShipped;
	@Column(name="ORDER_TOTAL")
	private BigDecimal total;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	public Date getDateOrdered() {
		return dateOrdered;
	}
	
	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	public Date getDateShipped() {
		return dateShipped;
	}
	
	public void setDateShipped(Date dateShipped) {
		this.dateShipped = dateShipped;
	}
	
	public BigDecimal getTotal() {
		return total;
	}
	
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
}
