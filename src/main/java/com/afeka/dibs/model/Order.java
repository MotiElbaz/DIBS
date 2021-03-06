package com.afeka.dibs.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ORDERS")
public class Order {

	@Id
	private Long id;
	
	private Long portfolioId;
	private String stockId;
	
	@Enumerated(EnumType.STRING)
	private OrderType type;
	
	private String paymentMethod;
	private Integer amount;
	private Integer amountCommited;
	private Double maxPrice;
	private Double minPrice;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	private Date expierdDate;
	
	
	
	public Order() {
		super();
	}

	public Order(Long id, Long portfolioId, String stockId, OrderType type, String paymentMethod, Integer amount,
			Double maxPrice, Double minPrice, Date expierdDate, OrderType status) {
		super();
		this.id = id;
		this.portfolioId = portfolioId;
		this.stockId = stockId;
		this.type = type;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
		this.maxPrice = maxPrice;
		this.minPrice = minPrice;
		this.amountCommited = 0;
		this.status = OrderStatus.PERFORMED;
		this.expierdDate = expierdDate;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(Long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public OrderType getType() {
		return type;
	}

	public void setType(OrderType type) {
		this.type = type;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	

	public Integer getAmountCommited() {
		return amountCommited;
	}

	public void setAmountCommited(Integer amountCommited) {
		this.amountCommited = amountCommited;
	}

	public Double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getExpierdDate() {
		return expierdDate;
	}

	public void setExpierdDate(Date expierdDate) {
		this.expierdDate = expierdDate;
	}
}
