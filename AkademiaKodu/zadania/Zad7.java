package zadania;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj cyfre x");
        int x = sc.nextInt();
        System.out.println("Podaj cyfre y");
        int y = sc.nextInt();
        System.out.println("Podaj cyfre z");
        int z = sc.nextInt();
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        if (z > max) {
            max = z;
            System.out.println(max);
        }
    }
}

