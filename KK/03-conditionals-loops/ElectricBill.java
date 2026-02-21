// Calculate Electricity Bill

// First 100 units → ₹5 per unit
// Next 100 units → ₹7 per unit
// Above 200 units → ₹10 per unit

import java.util.*;

class ElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units Consumed: ");
        int units = sc.nextInt();
        double bill = 0;
        if(units<=100){
            bill = units*5;
        }else if(units<=200){
            bill = (100*5) + (units-100)*7;
        }else{
            bill = (100*5) + (100*7) + (units-200)*10;
        }
        System.out.println("Total Electricity Bill = "+bill);
        sc.close();
    }
}
