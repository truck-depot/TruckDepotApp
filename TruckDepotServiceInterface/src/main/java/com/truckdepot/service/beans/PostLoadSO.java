package com.truckdepot.service.beans;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

import com.truckdepot.service.validator.IsDate;
import com.truckdepot.service.validator.IsTime;

public class PostLoadSO {
	@Valid
	private AddressSO originAddress;
	@Valid
	private AddressSO destinationAddress;
	@NotEmpty @IsDate
	private String pickupDate;
	@NotEmpty @IsDate
	private String deliveryDate;
	@NotEmpty @IsTime
	private String pickupTime;
	private String deliveryTime;
	private String notes;
	@NotEmpty @Min(value=0)
	private long shipperId;

	public AddressSO getOriginAddress() {
		return originAddress;
	}

	public void setOriginAddress(AddressSO originAddress) {
		this.originAddress = originAddress;
	}

	public AddressSO getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(AddressSO destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public long getShipperId() {
		return shipperId;
	}

	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
}
