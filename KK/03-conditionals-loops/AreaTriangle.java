// Area Of Triangle

import java.util.*;

class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base:");
        double b = sc.nextDouble();
        System.out.print("Enter the Height:");
        double h = sc.nextDouble();
        double area = 0.5f*b*h;
        System.out.println("Area of Triangle: "+area);
        sc.close();
    }
}
