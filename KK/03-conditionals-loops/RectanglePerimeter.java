// Perimeter Of Rectangle

import java.util.*;

class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double l = sc.nextDouble();
        System.out.print("Enter Breadth: ");
        double b = sc.nextDouble();
        double p = 2*(l+b);
        System.out.println("Perimeter = "+p);
        sc.close();
    }
}

