// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.: ");
        float n1 = sc.nextFloat();
        System.out.print("Enter second no.: ");
        float n2 = sc.nextFloat();
        if(n1>n2){
            System.out.println(n1+" is the largest no.");
        }else if(n2>n1){
            System.out.println(n2+" is the largest no.");
        }else{
            System.out.println("Both nos. are equal");
        }
        sc.close();
    }
}
