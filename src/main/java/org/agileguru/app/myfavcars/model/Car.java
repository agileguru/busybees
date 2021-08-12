package org.agileguru.app.myfavcars.model;

import java.io.Serializable;

public class Car implements Serializable {

	private static final long serialVersionUID = -2082124619707980301L;
	private String manufacturer;
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	
}
