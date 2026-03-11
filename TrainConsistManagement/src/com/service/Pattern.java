package com.service;

public class Pattern {
	public boolean validateTrainId(String trainId) {
		String pattern = "^TRN-\\d{4}$";
		
		return trainId.matches(pattern);
	}
	
	public boolean validateCargocode(String cargoCode) {
		String pattern = "^PET-[A-Z]{2}$";
		
		return cargoCode.matches(pattern);
	}
}
