// Take two numbers and print the sum of both.

import java.util.Scanner;

class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.:");
        int a = sc.nextInt();
        System.out.print("Enter second no.:");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum:"+c);
        sc.close();
    }
}