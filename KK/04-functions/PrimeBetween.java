// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

class PrimeBetween {
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void printPrimes(int start, int end){
        System.out.println("Prime nos. between "+start+" and "+end+" are: ");
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        printPrimes(start, end);
        sc.close();
    }
}
