// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.*;

class MaxMin{
    static void Max(int a,int b,int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println("Maximum no. = "+max);
    }

    static void Min(int a,int b,int c){
        int min = a;
        if(b < a){
            min = b;
        }
        if(c < min){
            min = c;
        }
        System.out.println("Minimum no. = "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        Max(a,b,c);
        Min(a,b,c);
        sc.close();
    }

}