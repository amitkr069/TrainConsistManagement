/**
 * @author Amit
 * @version 20.0
 * 
 * Here we are taking input as bogieID
 * and then taking user input to search for Id.
 * using binary search
 * before searching we are also doing exception handling to check if the train is empty.
 */
package com.main;

import com.service.*;

import java.util.Scanner;

public class TrainManagement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Train consist Management System");
		System.out.println();
		
		
		
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		TrainConsist train = new TrainConsist(n);
		
		train.addBogie();
		System.out.println("Original Bogies.");
		
		train.displayBogie();
		
		System.out.println();
		
		System.out.print("Enter bogie id to search: ");
		String id = sc.nextLine();
		
		try {
			
		
			int index = train.searchBogie(id);
			
			if(index == -1) {
				System.out.println("Bogie " + id + " not found");
			}
			else {
				System.out.println("Bogie " + id + " found in Train");
			}
		}
		catch (IllegalStateException ex){
			System.out.println(ex.getMessage());
		}
	
	}
}

