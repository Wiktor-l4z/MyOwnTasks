package zadania;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Napisz cyfre x");
        int x = sc.nextInt();
        System.out.println("Twoja cyfra to " + x);
        System.out.println("Cyfra 5*x wynosi " + 5 * x);
    }
}

