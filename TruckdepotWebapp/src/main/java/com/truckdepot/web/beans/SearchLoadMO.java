package com.truckdepot.web.beans;

import java.sql.Time;
import java.util.Date;

public class SearchLoadMO {
	private String name;
	private String email;
	private String mobileNumber;
	private AddressMO originAddress;
	private AddressMO destinationAddress;
	private Date pickupDate;
	private Date deliveryDate;
	private Time pickupTime;
	private Time deliveryTime;
	private long quoteId;
	private String notes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public AddressMO getOriginAddress() {
		return originAddress;
	}

	public void setOriginAddress(AddressMO originAddress) {
		this.originAddress = originAddress;
	}

	public AddressMO getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(AddressMO destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Time getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(Time pickupTime) {
		this.pickupTime = pickupTime;
	}

	public Time getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Time deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public long getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(long quoteId) {
		this.quoteId = quoteId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
