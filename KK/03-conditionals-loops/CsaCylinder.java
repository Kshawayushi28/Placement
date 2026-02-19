// Curved Surface Area Of Cylinder

import java.util.*;

class CsaCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter Height: ");
        double h = sc.nextDouble();
        double CSA = 2*Math.PI*r*h;
        System.out.println("Curver Surface Area = "+CSA);
        sc.close();
    }
}
