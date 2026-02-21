// Calculate Discount Of Product

import java.util.*;

class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Original Price: ");
        double op = sc.nextInt();
        System.out.print("Enter Final Price: ");
        double fp = sc.nextInt();
        double Discount = fp-op;
        double D = (Discount/op)*100;
        System.out.println("Discount Amount = "+Discount);
        System.out.println("Discount % = "+D);
        sc.close(); 
    }
}
