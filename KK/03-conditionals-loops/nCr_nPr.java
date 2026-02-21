// Find Ncr & Npr

import java.util.*;

class nCr_nPr{
    static long factorial(int n){
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter value of r: ");
        int r = sc.nextInt();
        if(r>n){
            System.out.println("Invalid input! r cannot be greater than n.");
        }else{
            long npr = factorial(n)/factorial(n-r);
            long ncr = factorial(n)/(factorial(r)*factorial(n-r));
            System.out.println("nPr = "+npr);
            System.out.println("nCr = "+ncr);
        }
        sc.close();
    }
}