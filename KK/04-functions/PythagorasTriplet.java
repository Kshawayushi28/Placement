// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.*;

class PythagorasTriplet {
    static void checkTriplet(int a,int b,int c){
        int x = a * a;
        int y = b * b;
        int z = c * c;
        if (x + y == z || x + z == y || y + z == x) {
            System.out.println("It is a Pythagorean Triplet");
        } else {
            System.out.println("Not a Pythagorean Triplet");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        checkTriplet(a, b, c);
        sc.close();
    }
}
