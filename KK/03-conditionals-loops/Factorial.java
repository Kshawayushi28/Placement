// Factorial Program In Java

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int n = sc.nextInt();
        int fact = 1;
        System.out.print(n + "! = ");
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.print(i);
            if(i < n) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + fact);
        sc.close();
    }
}
