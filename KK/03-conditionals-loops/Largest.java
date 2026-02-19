// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.*;

class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;
        System.out.print("Enter the nos. (0 to stop): ");
        while(true){
            n = sc.nextInt();
            if(n==0){
                break;
            }
            if(n>max){
                max = n;
            }
        }
        if(max == Integer.MIN_VALUE){
            System.out.println("No numbers entered.");
        }else{
            System.out.println("Largest no. = "+max);
        }
        sc.close();
    }
}
