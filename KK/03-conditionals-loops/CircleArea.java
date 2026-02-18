// Area Of Circle Java Program

import java.util.*;

class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius:");
        double r = sc.nextDouble();
        double area = Math.PI*r*r;
        System.out.println("Area of Circle: "+area);
        sc.close();
    }
}
