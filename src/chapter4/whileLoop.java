package chapter4;

import java.util.Scanner;

/*
While loop

*Each store employe eearn $15 an hour. Write a program that allows  the employees
*to enter the number of hours workes for the week. Do not allow overtimes.

*/

public class whileLoop{

    public static void main(String args[]){

        //Init
        int rate = 15;
        int maxHours= 40;


        //Get input
        System.out.println("How many hours did you work for this week");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDOuble();

        //validate input
        while(hoursWorked > maxHours){
            System.out.println("Invalid Entry! Must be between 1 and 40. ")
            hoursWorked = scanner.nextDOuble(); 
        }

        scanner.close();

        //calculate
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: "+ gross);

    }
    
}