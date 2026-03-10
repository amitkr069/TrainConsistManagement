/**
 * @author Amit
 * @version 3.0
 * 
 * This is Use case 3
 * In this we are adding bogie Ids in the set
 * Preventing duplicates
 * 
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
				
				System.out.print("Enter Bogie Id: ");
				String type = sc.nextLine();
				train.addBogie(type);
				break;
			case 2:
				System.out.print("Enter Bogie Id: ");
				type = sc.nextLine();
				train.removeBogie(type);
				break;
			case 3:
				train.displayTrainState();
				break;
			case 4:
				System.out.print("Enter Bogie Id: ");
				type = sc.nextLine();
				train.checkBogie(type);
				break;
			case 5:
				return;
			}
			
			
		}
				
		
	}
}
