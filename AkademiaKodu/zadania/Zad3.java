package zadania;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Napisz cyfre całkowitą");
        int number = sc.nextInt();
        System.out.println("Twoja cyfra całkowita wynosci " + number);
        System.out.println("Jej ostatnia cyfra tej liczny jest " + Math.abs(number) % 10);
    }
}
