/**
 * @author Amit
 * @version 15.0
 * 
 * Here we are taking input as Cargo type and shape
 * if cargo type is cylindrical and shape is not cylindrical then the system will throw an error
 * and the bogie will not be added in the list
 */
package com.main;

import com.service.*;
import com.validation.*;

import java.util.Scanner;

public class TrainManagement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Train consist Management System");
		System.out.println();
		
		TrainConsist train = new TrainConsist();
		
		while(true) {
			System.out.println("1. Add Bogie");
			
			System.out.println("2. Exit");
			
			
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.print("Enter Bogie Type: ");
				String bogieType = sc.nextLine();
				
				System.out.print("Enter Capacity: ");
				
				try {
					String shape = sc.nextLine();
					train.addBogie(bogieType, shape);
				}
				catch (NumberFormatException e){
					System.out.println("Error : Capacity should be an integer");
				}
				catch (CargoSafetyException e){
					System.out.println("\nError : "+e.getMessage());
				}
				finally {
					System.out.println("Execution handling completed.");
				}
				
				break;
			
			case 2:
				return;
			}
				
		}
	
	}
}

