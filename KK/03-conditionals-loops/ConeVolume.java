// Volume Of Cone Java Program

import java.util.*;

class ConeVolume{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Using Radius & Height");
        System.out.println("2. Using slant height & radius");
        System.out.print("Enter choice");
        int choice = sc.nextInt();
        double v = 0;
        switch(choice){
            case 1:
                System.out.print("Enter Radius: ");
                double r = sc.nextDouble();
                System.out.print("Enter Height: ");
                double h = sc.nextDouble();
                v = (Math.PI*r*r*h)/3;
                System.out.println("Volume = "+v);
                break;
            case 2:
                System.out.print("Enter Radius");
                r = sc.nextDouble();
                System.out.print("Enter Slant Height: ");
                double l = sc.nextDouble();
                h = Math.sqrt(l*l-r*r);
                v = (Math.PI*r*r*h)/3; 
                System.out.println("Volume = "+v); 
                break;      
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        sc.close();
    }
}