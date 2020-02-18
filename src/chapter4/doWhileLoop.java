package chapter4;

import java.util.Scanner;

/*
Do While loop

*Write a program that allow user to enter 2 numbers.
* and then sums up. The user should be able to
* repeat this action until they indicate they are done.

*/

public class doWHileLoop{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean again = false;

        do{
            System.out.println(" Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println(" Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println(" The sum is: "+ sum);

            System.out.println(" You want to try again? True o False ");
            again = scanner.nextBoolean();
            

        } while(again);

        scanner.close();

    }
    
}