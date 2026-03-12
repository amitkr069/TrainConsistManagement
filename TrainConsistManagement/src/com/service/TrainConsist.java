package com.service;

import java.util.Arrays;
import java.util.Scanner;


public class TrainConsist {

	private String[] bogieId;
	
	
	Scanner sc = new Scanner(System.in);
	
	public TrainConsist(int size) {
		if(size < 0) {
			throw new IllegalArgumentException("Size cannot be negative.");
		}
		bogieId = new String[size];
	}
	
	public void addBogie() {
		for(int i = 0; i<bogieId.length; i++) {
			
			System.out.print("Enter Bogie Id: ");
			String type = sc.nextLine();
			
			bogieId[i] = type;
		}
		
	}
	
	public void displayBogie() {
		System.out.println(Arrays.toString(bogieId));
	}
	
	
	public void sortBogie() {
		Arrays.sort(bogieId);
	}
	

	private void validateBogie() {
        boolean hasAny = Arrays.stream(bogieId)
                .anyMatch(s -> s != null && !s.isBlank());
        if (!hasAny) {
            throw new IllegalStateException("No bogies available to search.");
        }
    }

	
	public int searchBogie(String id) {
		validateBogie();
		sortBogie();
		int left = 0;
        int right = bogieId.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            int cmp = bogieId[mid].compareTo(id);

            if (cmp == 0) {
                return mid; 
            } else if (cmp < 0) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1; 
	}
		
}