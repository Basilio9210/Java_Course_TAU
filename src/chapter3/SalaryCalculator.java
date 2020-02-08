package chapter3;
/*calculate salary with conditions*/

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]){

        //Initializae the values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        //Get what I dont know
        System.out.println("How many sales did this week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour
        if (sales > quota){
            salary = salary + bonus;
            System.out.println("The employees deserve the pay of: "+ salary);
        }
        //Output

        else{
            System.out.println("Dont deserve your salary");
        }
    }
}
