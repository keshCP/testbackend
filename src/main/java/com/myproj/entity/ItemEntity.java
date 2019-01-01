package com.myproj.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class ItemEntity {

	private Integer itId;
	private String itName;
	private Double itPrice;
	
	private CustomerEntity customerEntity;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getItId() {
		return itId;
	}

	public void setItId(Integer itId) {
		this.itId = itId;
	}

	public String getItName() {
		return itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public Double getItPrice() {
		return itPrice;
	}

	public void setItPrice(Double itPrice) {
		this.itPrice = itPrice;
	}

	
	@ManyToOne(cascade=CascadeType.ALL)
	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
	
	
	
}
