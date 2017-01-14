package zadania;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Napisz cyfre a");
        int a = sc.nextInt();
        System.out.println("Napisz cyfre b");
        int b = sc.nextInt();
        System.out.println("Cyfre x=" + a );
        System.out.println("Cyfre y=" + b );
        System.out.println("Dodawanie a+b=" + (a + b) );
        System.out.println("Odejmowanie a-b=" + (a - b) );
        System.out.println("Mnozenie a*b=" + a * b );
        System.out.println("Dzielenie=" + a/b );
        System.out.println("%=" + a%b );

    }
}
