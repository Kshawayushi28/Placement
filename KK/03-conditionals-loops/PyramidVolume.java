// Volume Of Pyramid

import java.util.*;

class PyramidVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base Area: ");
        double b = sc.nextDouble();
        System.out.print("Enter Height: ");
        Double h = sc.nextDouble();
        double v = (b*h)/3;
        System.out.println("Volume = "+v);
        sc.close();
    }    
}
