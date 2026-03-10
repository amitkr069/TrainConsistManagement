package com.model;

public class Bogie {
	private String bogieId;
	private String bogieType;
	
	
	public Bogie(String bogieType) {
		this.bogieType = bogieType;
	}
	
//	public String getBogieId() {
//		return bogieId;
//	}
	
	public String getBogieType() {
		return bogieType;
	}
	
	@Override
	public String toString() {
		return bogieType;
	}
}
