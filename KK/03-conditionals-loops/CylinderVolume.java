// Volume Of Cylinder

import java.util.*;

class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter Height: ");
        double h = sc.nextDouble();
        double v = Math.PI*r*r*h;
        System.out.println("Volume = "+v);
        sc.close();
    }
}
