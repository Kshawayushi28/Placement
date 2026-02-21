// Calculate CGPA Java Program

import java.util.*;

class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Subjects: ");
        int n = sc.nextInt();
        double sum = 0;
        for(int i=1;i<=n;i++){
            System.out.print("Enter grade point for subjects "+i+": ");
            double grade = sc.nextDouble();
            sum += grade;
        }
        double cgpa = sum/n;
        System.out.println("CGPA= "+cgpa);
        sc.close();
    }
}
