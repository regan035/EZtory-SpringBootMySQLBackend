package com.EZtory.application.restfulwebservices;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="inventory")
public class Inventory {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="item_name")
	private String itemName;
	@Column(name="model_number")
	private String modelNumber;
	@Column(name="serial_number")
	private String serialNumber;
	@Column(name="storage_location")
	private String storageLocation;
	@Column(name="quantity")
	private double quantity;
	@Column(name="unit")
	private String unit;
	@Column(name="unit_value")
	private double unitValue;
	@Column(name="total_value")
	private double totalValue;
	@Column(name="time_stamp")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime timeStamp;
	
	
	public Inventory() {
		
	}
	public Inventory(Long id, String itemName, String modelNumber, String serialNumber, String storageLocation,
			double quantity, String unit, double unitValue, double totalValue, LocalDateTime timeStamp) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.modelNumber = modelNumber;
		this.serialNumber = serialNumber;
		this.storageLocation = storageLocation;
		this.quantity = quantity;
		this.unit = unit;
		this.unitValue = unitValue;
		this.totalValue = quantity * unitValue;
		this.timeStamp = timeStamp;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getUnitValue() {
		return unitValue;
	}
	public void setUnitValue(double unitValue) {
		this.unitValue = unitValue;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inventory other = (Inventory) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
}
