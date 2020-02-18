package chapter4;

import java.util.Scanner;

/*
 Foor loop

*Write a cashier program that will scan a given number of items and tally the cost.

*/

public class forLoop {
    
    //Get  number of items
    System.out.println("Enter the number of items you would like to scan: ");
    Scanner scanner = new Scanner(System.in);
    int quatity = scanner.nextInt();
    scanner.close();


    double total = 0;

    //crete loop
    for (int i=0; i<quatity; i++){

        System.out.println("Enter the cost of the item: ");
        double price = scanner.nextDouble();

        total = total + price;
    }

    scanner.close();

    System.out.println("The total is: "+ total);

}
