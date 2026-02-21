// Reverse A String In Java

import java.util.*;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i); 
        }
        System.out.println("Reversed String = "+rev);
        sc.close();
    }
}
