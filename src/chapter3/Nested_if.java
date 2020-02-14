package chapter3;
/*Qualify loan for a person*/

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String args[]){

        //Initializae the values we know
        int rqueried_salary = 30000;
        int requeriedTYearEmployed = 2;
        
        //Get what I dont know
        System.out.println("Enter your salary? ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        

        System.out.println("Enter the number of year of the employee ");
        double year = scanner.nextDouble();
        scanner.close();


        //Make decision
        if (salary >= rqueried_salary)
        {
            if(year >= requeriedTYearEmployed)
            {
                System.out.println("COngrats! you qualify  for the loan");
            }
            else
            {
                System.out.println("Sorry! you don't qualify  for the loan"+ requeriedTYearEmployed + " years");
            }
        }
        else
        {
            System.out.println("Sorry you must earn at least $ "+ rqueried_salary + " to qualify");
        }
        //Output

        else{
            System.out.println("Dont deserve your salary");
        }
    }
}
