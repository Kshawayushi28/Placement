// Calculate Batting Average

import java.util.*;

class BattingAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Runs: ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Times Out: ");
        int o = sc.nextInt();
        if(o == 0){
            System.out.println("Average = "+r);
        } 
        else{
            double avg = (double) r/o;
            System.out.println("Batting Average = "+avg);
        }
        sc.close();
    }
}
