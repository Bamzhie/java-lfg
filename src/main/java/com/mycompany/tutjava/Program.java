
package com.mycompany.tutjava;


import java.util.Scanner;

public class Program {
    public static void main(String[] main) {
        // Creating the Scanner
        Scanner reader = new Scanner(System.in);

        // Declaring the variables and assigning user input to them
        int num = Integer.parseInt(reader.nextLine());
       

        // Identifying the operation and declaring a variable for the result
        int square = num * num;

        // Printing the result of the operation
        System.out.println("The square of " + num +  " is " + square);

    }
}
