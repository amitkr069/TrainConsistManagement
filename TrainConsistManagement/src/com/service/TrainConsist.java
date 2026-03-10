package com.service;


//import java.util.ArrayList;
import java.util.List;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

import com.model.*;
public class TrainConsist {
	private Set<String> bogiesSet;
	private List<String> bogiesList;
	
	public TrainConsist() {
		bogiesSet = new HashSet<>();
		bogiesList = new LinkedList<>();
		
	}
	
	public int getBogieCount() {
		return bogiesList.size();
	}
	
	public void addBogieAtFirst(String Bogietype) {
		if(bogiesSet.contains(Bogietype)) return;
		
		bogiesList.addFirst(Bogietype);
		bogiesSet.add(Bogietype);
		
		System.out.println(Bogietype + "Bogie added..");
	}
	
	
	public void addBogieAtLast(String Bogietype) {
		if(bogiesSet.contains(Bogietype)) return;
		
		bogiesList.addLast(Bogietype);
		bogiesSet.add(Bogietype);
		
		System.out.println(Bogietype + "Bogie added..");
	}
	
	public void addBogieAtIndex(int index, String Bogietype) {
		if(bogiesSet.contains(Bogietype)) return;
		
		if (index < 0 || index > bogiesList.size()) {
            System.out.println("Error: Index out of bounds.");
            return;
        }
		
		bogiesList.add(index, Bogietype);
		bogiesSet.add(Bogietype);
		int position = index + 1;
		System.out.println(Bogietype + "Bogie added at " + position + " position");
	}
	
	
	public void removeBogieFromFront() {
				if(bogiesList.isEmpty()) {
					System.out.println("No bogies..");
					return;
				}
				bogiesList.removeFirst();
				System.out.println("Bogie removed from front");
		
	}
	
	public void removeBogieFromEnd() {
		if(bogiesList.isEmpty()) {
			System.out.println("No bogies..");
			return;
		}
		bogiesList.removeLast();
		System.out.println("Bogie removed from End");

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
		System.out.println("Current Train consist: " + bogiesList);
	}
}
