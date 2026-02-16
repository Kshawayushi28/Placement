// To find Armstrong Number between two given number.

import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting no.");
        int start = sc.nextInt();
        System.out.print("Enter ending no.");
        int end = sc.nextInt();
        System.out.println("Armstrong nos. between "+start+" and "+end+" are:");
        for(int i=start;i<=end;i++){
            int num = i;
            int original = i;
            int sum = 0;
            int digits = String.valueOf(i).length();
            while(num>0){
                int digit = num%10;
                sum += Math.pow(digit,digits);
                num=num/10;
            }
            if(sum==original){
                System.out.println(original);
            }
        }
        sc.close();
    }
}
