// Take a number as input and print the multiplication table for it.

import java.util.Scanner;

class MulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        for(int i=119;i<=10;i++){
            System.out.println(n+"X"+i+"="+(n*i));
        }
        sc.close();
    }
}
