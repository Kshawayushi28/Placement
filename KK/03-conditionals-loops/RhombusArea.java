// Area Of Rhombus

import java.util.*;

class RhombusArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Height is Given");
        System.out.println("2. Angle is Given");
        System.out.println("3. Diagonals are Given");
        System.out.print("Enter Choice: ");      
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.print("Enter Base: ");
            double b = sc.nextDouble();
            System.out.print("Enter Height: ");
            double h = sc.nextDouble();
            double area = b*h;
            System.out.println("Area = "+area);
        }
        else if(choice == 2){
            System.out.print("Enter Side: ");
            double s = sc.nextDouble();
            System.out.print("Enter angles (in degrees): ");
            double angle = sc.nextDouble();
            double radian = Math.toRadians(angle);
            double area = s*s*Math.sin(radian);
            System.out.println("Area = "+area);
        }
        else if(choice == 3){
            System.out.print("Enter Diagonal 1: ");
            double d1 = sc.nextDouble();
            System.out.print("Enter Diagonal 2: ");
            double d2 = sc.nextDouble();
            double area = (d1*d2)/2;
            System.out.println("Area = "+area);
        }
        else{
            System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
