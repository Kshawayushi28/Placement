// Perimeter Of Equilateral Triangle

import java.util.*;

class EquiTrianglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side: ");
        double s = sc.nextDouble();
        double p = 3*s;
        System.out.println("Perimeter = "+p);
        sc.close();
    }
}
