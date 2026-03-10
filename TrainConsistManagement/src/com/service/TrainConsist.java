package com.service;


//import java.util.ArrayList;
//import java.util.List;

import java.util.Set;
//import java.util.HashSet;
//import java.util.LinkedList;

import java.util.LinkedHashSet;

public class TrainConsist {
	private Set<String> bogiesSet;
//	private List<String> bogiesList;
	
	public TrainConsist() {
		bogiesSet = new LinkedHashSet<>();
//		bogiesList = new LinkedList<>();
		
	}
	
	public int getBogieCount() {
		return bogiesSet.size();
	}
	
	public void addBogie(String Bogietype) {
		bogiesSet.add(Bogietype);
		
		System.out.println(Bogietype + "Bogie added..");
	}
	
	
	public void checkBogie(String type) {
		boolean found = false;
		
		
			if(bogiesSet.contains(type)) {
				found = true;
			}
			
		
		if(found) {
			System.out.println(type + " Bogie exits in train");
		}
		else {
			System.out.println(type + " bogie does not exist in train");
		}
	}
	
	public void displayTrainState() {
		System.out.println("Current Train consist: " + bogiesSet);
	}
}
