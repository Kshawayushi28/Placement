// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.*;

class NSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        System.out.print("Enter the nos.(0 to stop): ");
        while(true){
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            sum += n;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
