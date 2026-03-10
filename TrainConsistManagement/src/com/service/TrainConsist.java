package com.service;


import java.util.ArrayList;
import java.util.List;

import com.model.*;
public class TrainConsist {
	private List<Bogie> bogies;
	
	public TrainConsist() {
		bogies = new ArrayList<>();
	}
	
	public int getBogieCount() {
		return bogies.size();
	}
	
	public void displayTrainState() {
		System.out.println("Initial Train consist: " + bogies);
	}
}
