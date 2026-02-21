// Perfect Number In Java

import java.util.*;

class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum == n & n!=0){
            System.out.println(n+" is a Perfect no.");
        }else{
            System.out.println(n+" is not a Perfect no.");
        }
        sc.close();
    }
}
