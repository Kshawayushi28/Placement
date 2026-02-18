// Area Of Equilateral Triangle

import java.util.*;

class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side: ");
        double s = sc.nextDouble();
        double area = (Math.sqrt(3)/4)*s*s;
        System.out.println("Area = "+area);
        sc.close();
    }
}
