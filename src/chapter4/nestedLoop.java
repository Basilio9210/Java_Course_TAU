package chapter4;

import java.util.Scanner;

/*
 Nested loop

 *Find the average of each student's test scores

*/

public class nestedLoop{

    public static void main(String args[]) {

        //Initiialize
        int numberOfStudents = 24;
        int numberofTest = 4;

        Scanner scanner = new Scanner(System.in);
        //process all students

        for(int i=0; i<numberOfStudents; i++){

            double total = 0;
            for(j = 0; j<numberofTest; j++){

                System.out.println("Enter the score for test #: " + (j+1));
                double score = scanner.nextDouble();
                total = total + score;

            }

            double average = total/numberofTest;
            System.out.println("The test average for student # "+ (i+1) + " is " + average);

        }

        scanner.close();
        
    }
}