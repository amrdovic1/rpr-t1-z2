package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara (int n)
    {
        int sum = 0;
        int temp = n;
        while (temp > 0)
        {
            sum += temp%10;
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Unijeti broj n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Brojevi od 1 do " + n + " djeljivi sa zbirom svojih cifara su:");
        for (int i = 1; i <= n; i++)
        {
            if (i%sumaCifara(i) == 0)
            {
                System.out.println(i);
            }
        }
    }
}
