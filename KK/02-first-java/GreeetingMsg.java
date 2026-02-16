// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

class GreeetingMsg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.next();
        System.out.println("Hello "+name+"! Welcome to VS Code");
        sc.close();
    }
}
