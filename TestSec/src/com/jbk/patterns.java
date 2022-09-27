package com.jbk;

import java.util.Scanner;

public class patterns {
public static void main(String[] args) {
	
	// Create a new Scanner object
   // Scanner scanner = new Scanner(System.in);

    // Get the number of rows from the user
   // System.out.println("Enter the number of rows needed in the pattern ");

    //int rows = scanner.nextInt();

   // System.out.println("** Printing the pattern... **");

    for (int i = 1; i <= 5; i++)
    {
        for (int j = 5; j > i; j--)
        {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
	
	
	
	

}
