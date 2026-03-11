/**
 * @author Amit
 * @version 11.0
 * 
 * Here we are taking input as train Id and cargo code and
 * validating using regex and printing if either are true or false
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
		
		
		
		System.out.print("Enter Train Id (Format - TRN-1234): ");
		String trainId = sc.nextLine();
		
		System.out.print("Enter Cargo code (Format PET-AB): ");
		String cargoCode = sc.nextLine();
		
		
		
		Pattern matcher = new Pattern();
		System.out.println("Train ID Valid: " + matcher.validateTrainId(trainId) );
		
		System.out.println("Cargo Code Valid: " + matcher.validateCargocode(cargoCode));
				
		
	}
}

