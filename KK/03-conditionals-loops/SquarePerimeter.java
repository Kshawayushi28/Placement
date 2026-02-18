// Perimeter Of Square

import java.util.*;

class SquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side: ");
        double s = sc.nextDouble();
        double p = 4*s;
        System.out.println("Perimeter = "+p);
        sc.close();
    }
}
