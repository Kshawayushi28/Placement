// Perimeter Of Parallelogram

import java.util.*;

class ParallelogramPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        double p = 2*(a+b);
        System.out.println("Perimeter = "+p);
        sc.close();
    }
}
