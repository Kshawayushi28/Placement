// Calculate Depreciation of Value

import java.util.*;

class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double c = sc.nextDouble();
        System.out.print("Enter Scrap Value: ");
        double s = sc.nextDouble();
        System.out.print("Enter Useful Life (years): ");
        int l = sc.nextInt();
        System.out.print("Enter Number of years used: ");
        int y = sc.nextInt();
        double DepreciationPerYear = (c-s)/l;
        double value = c - (DepreciationPerYear*y);
        System.out.println("Depreciation per year: "+DepreciationPerYear);
        System.out.println("Value after: "+y+" years: "+value);
        sc.close();
    }
}
