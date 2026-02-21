// Sum Of A Digits Of Number

import java.util.*;

class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = Math.abs(n);
        while(temp>0){
            int digit = temp%10;
            sum+= digit;
            temp = temp/10;
        }
        System.out.println("Sum of Digits = "+sum);
        sc.close();
    }
}
