// Area Of Rectangle Program

import java.util.*;

class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length:");
        double l = sc.nextDouble();
        System.out.print("Enter the Breadth:");
        double b = sc.nextDouble();
        double area = l*b;
        System.out.println("Area of Rectangle: "+area);
        sc.close();
    }
}
