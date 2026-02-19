// Total Surface Area Of Cube

import java.util.*;

class TSACube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side: ");
        double s = sc.nextDouble();
        double TSA = 6*s*s;
        System.out.println("Total Surface Area = "+TSA);
        sc.close();
    }
}
