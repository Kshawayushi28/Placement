// Calculate Average Of N Numbers

import java.util.*;

class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the nos.: ");
        int n = sc.nextInt();
        double sum = 0;
        for(int i=1;i<=n;i++){
            System.out.print("Enter no.: "+i+": ");
            sum += sc.nextDouble();
        }
        double avg = sum/n;
        System.out.println("Average = "+avg);
        sc.close();
    }
}
