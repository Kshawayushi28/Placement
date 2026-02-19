// Addition Of Two Numbers

import java.util.*;

class AddTwoNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First no.: ");
        int a = sc.nextInt();
        System.out.print("Enter Second no.: ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum = "+c);
        sc.close();
    }
}
