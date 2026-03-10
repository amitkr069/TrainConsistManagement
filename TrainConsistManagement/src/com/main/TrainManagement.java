/**
 * @author Amit
 * @version 2.0
 * 
 * This is Use case 2
 * In this we are adding bogie type in the List;
 * and also removing bogie type from the list and checking the type of bogie;
 * 
 * 
 * At this stoge, the application: 
 * Adds new bogies to the train 
 * Removes existing bogies 
 * Checks for bogie availability 
 * Displays the final consist
 */
package com.main;

import com.service.*;

import java.util.Scanner;

public class TrainManagement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Train consist Management System");
		System.out.println();
		
		TrainConsist train = new TrainConsist();
		
//		System.out.println("Initial Bogie count: " + train.getBogieCount());
		
//		train.displayTrainState();
		
		
		
		
		while(true) {
			System.out.println("1. Add Bogie");
			System.out.println("2. Remove Bogie");
			System.out.println("3. See Train");
			System.out.println("4. Check for a Bogie");
			System.out.println("5. Exit");
			
			
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			
			sc.nextLine();
			
			
			switch(choice) {
			case 1:
				
				System.out.print("Enter Bogie Type: ");
				String type = sc.nextLine();
				train.addBogie(type);
				break;
			case 2:
				System.out.print("Enter Bogie Type: ");
				type = sc.nextLine();
				train.removeBogie(type);
				break;
			case 3:
				train.displayTrainState();
				break;
			case 4:
				System.out.print("Enter Bogie Type: ");
				type = sc.nextLine();
				train.checkBogie(type);
				break;
			case 5:
				return;
			}
			
			
		}
				
		
	}
}
