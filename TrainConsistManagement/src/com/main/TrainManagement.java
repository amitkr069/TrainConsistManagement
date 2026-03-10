/**
 * @author Amit
 * @version 4.0
 * 
 * This is Use case 4
 * In this we are using LinkedList and hashSet both
 * set ensure the unique elements and linked list maintains the order
 * here we are also adding and removing bogies from the front and rear both.
 * we are also adding bogie at any position.
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
			System.out.println("1. Add Bogie at the front");
			System.out.println("2. Add Bogie at the end");
			System.out.println("3. Add Bogie at any position");
			System.out.println("4. Remove Bogie from the front");
			System.out.println("5. Remove Bogie from the end");
			System.out.println("6. See Train");
			System.out.println("7. Check for a Bogie");
			System.out.println("8. Exit");
			
			
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			
			sc.nextLine();
			
			
			switch(choice) {
			case 1:
				
				System.out.print("Enter Bogie Type: ");
				String type = sc.nextLine();
				train.addBogieAtFirst(type);
				break;
			case 2:
				System.out.print("Enter Bogie Type: ");
				type = sc.nextLine();
				train.addBogieAtLast(type);
				break;
			case 3:
				System.out.print("Enter position: ");
				int pos = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter Bogie Type: ");
				type = sc.nextLine();
				train.addBogieAtIndex(pos - 1, type);
				break;
				
			case 4:
				train.removeBogieFromFront();
				break;
			case 5:
				train.removeBogieFromEnd();
				break;
			
			case 6:
				train.displayTrainState();
				break;
			case 7:
				System.out.print("Enter Bogie Id: ");
				type = sc.nextLine();
				train.checkBogie(type);
				break;
			case 8:
				return;
			}
			
			
		}
				
		
	}
}
