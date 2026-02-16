// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1:");
        float n1 = sc.nextFloat();
        System.out.print("Enter n2:");
        float n2 = sc.nextFloat();
        System.out.print("Enter operator (+,-,*,/): ");
        char op = sc.next().charAt(0);
        float result;
        if(op=='+'){
            result=n1+n2;
            System.out.println("RESULT: "+result);
        }else if(op=='-'){
            result=n1-n2;
            System.out.println("RESULT: "+result);
        }else if(op=='*'){
            result=n1*n2;
            System.out.println("RESULT: "+result);
        }else{
           if(n2!=0){
                result=n1/n2;
                System.out.println("RESULT: "+result);
           }else{
                System.out.println("Cannot be divided");
           }
        }
        sc.close();
    }
}
