package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static  void  main(String args[]){
        /*calculate the salary of an employee */
        System.out.println("Enter the number of hours that the employee worked ");
        Scanner scanner = new Scanner((System.in));
        int hours = scanner.nextInt();

        //get the hour pay
        System.out.println("Enter the  employee pay rate ");
        double rate = scanner.nextDouble();

        //multiply hour per rate.
        double grossPay = hours * rate;

        //disply the result
        System.out.println(grossPay);




    }
}
