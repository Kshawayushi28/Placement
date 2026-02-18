// Area Of Isosceles Triangle

import java.util.*;

class IsoscelesTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Height is given");
        System.out.println("2. Height is not given");
        System.out.print("Enter your choice: ");
        int choice =sc.nextInt();
        double area;
        if(choice == 1){
            System.out.print("Enter the Base:");
            double b = sc.nextDouble();
            System.out.print("Enter the Height");
            double h = sc.nextDouble();
            area = 0.5*b*h;
            System.out.println("Area: "+area);
        }else if(choice == 2){
            System.out.print("Enter the Equal Sides (a):");
            double a = sc.nextDouble();
            System.out.print("Enter the Base:");
            double b = sc.nextDouble();
            area = (b/4)*Math.sqrt((4*a*a)-(b*b));
            System.out.println("Area of Rectangle: "+area);
        }else{
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}