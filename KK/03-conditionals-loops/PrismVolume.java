// Volume Of Prism

import java.util.*;

class PrismVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base Area: ");
        double b = sc.nextDouble();
        System.out.print("Enter Height: ");
        Double h = sc.nextDouble();
        double v = b*h;
        System.out.println("Volume = "+v);
        sc.close();
    }
}
