package com.julio.cursomc.entity;

import java.util.List;

public class ResultsAPIGoogle {

	private List<AddressComponentsAPIGoogle> address_components;
	private String formatted_address;
	private GeometryAPIGoogle geometry;
	private boolean partial_match;
	private String place_id;
	private List<String> types;

	public GeometryAPIGoogle getGeometry() {
		return geometry;
	}

	public void setGeometry(GeometryAPIGoogle geometry) {
		this.geometry = geometry;
	}

	public List<AddressComponentsAPIGoogle> getAddress_components() {
		return address_components;
	}

	public void setAddress_components(List<AddressComponentsAPIGoogle> address_components) {
		this.address_components = address_components;
	}

	public String getFormatted_address() {
		return formatted_address;
	}

	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}

	public boolean isPartial_match() {
		return partial_match;
	}

	public void setPartial_match(boolean partial_match) {
		this.partial_match = partial_match;
	}

	public String getPlace_id() {
		return place_id;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}
	
	
	
}
