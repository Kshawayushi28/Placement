// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 0,b = 1;
        // if(n==0){
        //     System.out.println(a);
        // }else if(n==1){
        //     System.out.println(b);
        // }
        // else{
            for(int i=1;i<=n;i++){
                System.out.print(a + " ");
                int c = a+b;
                a=b;
                b=c;
            }
            // System.out.println("Fibonacci no. is: "+b);
        // }
        sc.close();
    }
}