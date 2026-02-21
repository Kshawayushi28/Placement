// Calculate Distance Between Two Points

import java.util.*;

class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a1: ");
        double a1 = sc.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Enter a2: ");
        double a2 = sc.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = sc.nextDouble();
        double d = Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));
        System.out.println("Distance = "+d);
        sc.close();
    }
}
