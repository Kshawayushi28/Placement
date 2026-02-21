// Power In Java

import java.util.*;

class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter Base: ");
        double b = sc.nextDouble();
        System.out.print("Enter Exponent: ");
        double e = sc.nextDouble();
        double r = Math.pow(b,e);
        System.out.println("Power = "+r);
        sc.close();
    }
}
