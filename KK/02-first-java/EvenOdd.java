// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even no.");
        }
        else{
            System.out.println("Odd no.");
        }
        sc.close();
    }
}