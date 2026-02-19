// Volume Of Sphere

import java.util.*;

class SphereVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        double v = (4*Math.PI*r*r*r)/3;
        System.out.println("Volume = "+v);
        sc.close();
    }
}
