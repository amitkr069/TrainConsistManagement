package com.model;

public class Bogie {
	private String bogieId;
	private String bogieType;
	
	
	public Bogie(String bogieId) {
		this.bogieId = bogieId;
	}
	
	public String getBogieId() {
		return bogieId;
	}
	
//	public String getBogieType() {
//		return bogieType;
//	}
	
	@Override
	public String toString() {
		return bogieType;
	}
}
