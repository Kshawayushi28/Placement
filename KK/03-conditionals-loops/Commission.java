// Calculate Commission Percentage

import java.util.*;

class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Sales: ");
        double s = sc.nextDouble();
        System.out.print("Enter Commission Amount: ");
        double c = sc.nextDouble();
        double CommissionPercent = (c/s)*100;
        System.out.println("Commission Percent = "+CommissionPercent);
        sc.close(); 
    }
}
