/**
 * @author Amit
 * @version 12.0
 * 
 * Here we are taking input as Cargo type and bogie type
 * then doing a safety compliance check such that for cylindrical only petroleum is allowed
 * else its not safe
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
		
		System.out.print("Enter Bogie Type: ");
		String bogieType = sc.nextLine();
		
		System.out.print("Enter Cargo Type: ");
		String cargoType = sc.nextLine();
		
		train.addBogie(bogieType, cargoType);
		
		System.out.println("Safety Compliance Status: " + train.checkSafety());
		
		
		
	}
}

