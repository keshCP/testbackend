package com.myproj.dto;

import java.util.List;

public class CustomerDto {

	private Integer cusId;
	private String cusName;
	private String cusAddress;
	
	private List<ItemDto> itemDtoList;

	public Integer getCusId() {
		return cusId;
	}

	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	public List<ItemDto> getItemDtoList() {
		return itemDtoList;
	}

	public void setItemDtoList(List<ItemDto> itemDtoList) {
		this.itemDtoList = itemDtoList;
	}
	
	
	
	
	
	
}
