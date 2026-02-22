// Define a method to find out if a number is prime or not.

import java.util.*;

class Prime {
    static void checkPrime(int n){
        if(n<=1){
            System.out.println("Not Prime");
            return;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        checkPrime(n);
        sc.close();
    }    
}
