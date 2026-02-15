// Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

class HCF_LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.:");
        int num1 = sc.nextInt();
        System.out.print("Enter second no.:");
        int num2 = sc.nextInt();
        int a = num1;
        int b = num2;
        // HCF
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int hcf = a;
        // LCM
        int lcm = (num1*num2)/hcf;
        System.out.println("HCF:"+hcf);
        System.out.println("LCM:"+lcm);
        sc.close();
    }
}
