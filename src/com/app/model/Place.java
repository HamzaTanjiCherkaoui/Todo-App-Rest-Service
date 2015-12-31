package com.app.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="place")
public class Place {

	private Double longitude ;
	private Double latitude ; 
	private String address ;
	private String timeStamp;
	
	
	
	public Place(Double longitude, Double latitude, String address,
			String timeStamp) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.address = address;
		this.timeStamp = timeStamp;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	@XmlElement
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	@XmlElement
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@XmlElement
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	} 
	
}
