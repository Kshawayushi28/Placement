// Area Of Parallelogram

import java.util.*;

class ParallelogramArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Height is Given");
        System.out.println("2. Height is not Given");
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
            System.out.print("Enter side A: ");
            double a = sc.nextDouble();
            System.out.print("Enter side B: ");
            double b = sc.nextDouble();
            System.out.print("Enter angles (in degrees): ");
            double angle = sc.nextDouble();
            double radian = Math.toRadians(angle);
            double area = a*b*Math.sin(radian);
            System.out.println("Area = "+area);
        }else{
            System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
