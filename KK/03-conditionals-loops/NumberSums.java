// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class NumberSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        System.out.print("Enter numbers (0 to stop):");

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;   // stop when 0 is entered
            }

            if (num < 0) {
                negativeSum += num;
            } 
            else if (num % 2 == 0) {
                positiveEvenSum += num;
            } 
            else {
                positiveOddSum += num;
            }
        }

        System.out.println("Sum of Negative Numbers: " + negativeSum);
        System.out.println("Sum of Positive Even Numbers: " + positiveEvenSum);
        System.out.println("Sum of Positive Odd Numbers: " + positiveOddSum);

        sc.close();
    }
}