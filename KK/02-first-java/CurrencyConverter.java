// Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in Rupees: ");
        float rupees = sc.nextFloat();
        float exchangerate = 90.75f;
        float usd = rupees/exchangerate;
        System.out.println("Amount in USD: "+usd);
        sc.close();
    }
}
