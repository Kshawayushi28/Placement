// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal:");
        float p = sc.nextFloat();
        System.out.print("Enter Time:");
        int t = sc.nextInt();
        System.out.print("Enter Rate:");
        Float r = sc.nextFloat();
        float si = (p*r*t)/100;
        System.out.print("Simple Interest:"+si);
        sc.close();
    }
}
