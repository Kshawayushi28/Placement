// Perimeter Of Circle

import java.util.*;

class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius:");
        double r = sc.nextDouble();
        double p = 2*Math.PI*r;
        System.out.println("Perimeter of Circle: "+p);
        sc.close();
    }
}
