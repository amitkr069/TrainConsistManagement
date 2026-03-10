package com.service;



import java.util.Map;
import java.util.HashMap;


public class TrainConsist {

	private Map<String, Integer> bogieMap;
	
	public TrainConsist() {
		bogieMap = new HashMap<>();
		
	}
	
	public int getBogieCount() {
		return bogieMap.size();
	}
	
	public void addBogie(String Bogietype, int capacity) {
		bogieMap.put(Bogietype, capacity);
		
		System.out.println(Bogietype + "Bogie added with capacity: " + capacity);
	}
	
	
	public void displayTrainState() {
		System.out.println("Bogie capacity details...");
		for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
	}
}
