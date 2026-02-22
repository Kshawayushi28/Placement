// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 

import java.util.*;

class Grades {
    static void displayGrades(int marks){
        if(marks >= 91 && marks <=100){
            System.out.println("Grade = AA");
        }
        else if(marks >= 81){
            System.out.println("Grade = AB");
        }
        else if(marks >= 71){
            System.out.println("Grade = BB");
        }
        else if(marks >= 61){
            System.out.println("Grade = BC");
        }
        else if(marks >= 51){
            System.out.println("Grade = CD");
        }
        else if(marks >= 41){
            System.out.println("Grade = DD");
        }
        else{
            System.out.println("Grade = FAIL");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        displayGrades(marks);
        sc.close();
    }
}
