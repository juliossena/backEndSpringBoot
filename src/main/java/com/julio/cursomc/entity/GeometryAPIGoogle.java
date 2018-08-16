package com.julio.cursomc.entity;

public class GeometryAPIGoogle {

	private BoundsAPIGoogle bounds;
	private LocationAPIGoogle location;
	private String location_type;
	private BoundsAPIGoogle viewport;
	
	
	public LocationAPIGoogle getLocation() {
		return location;
	}

	public void setLocation(LocationAPIGoogle location) {
		this.location = location;
	}

	public BoundsAPIGoogle getBounds() {
		return bounds;
	}

	public void setBounds(BoundsAPIGoogle bounds) {
		this.bounds = bounds;
	}

	public String getLocation_type() {
		return location_type;
	}

	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}

	public BoundsAPIGoogle getViewport() {
		return viewport;
	}

	public void setViewport(BoundsAPIGoogle viewport) {
		this.viewport = viewport;
	}
	
	
}
