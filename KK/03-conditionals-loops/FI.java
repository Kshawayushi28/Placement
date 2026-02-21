// Future Investment Value

import java.util.*;

class FI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time: ");
        int t = sc.nextInt();
        double ci = p*Math.pow((1+r/100),t);
        System.out.println("Compound Interest = "+ci);
        sc.close();
    }
}
