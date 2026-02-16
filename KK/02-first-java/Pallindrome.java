// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String original = str;
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("Pallindrome no.");
        }else{
            System.out.println("Not a Pallindrome no.");
        }
        sc.close();
    }
}
