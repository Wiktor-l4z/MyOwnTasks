package zadania;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Napisz cyfre");
        int number = sc.nextInt();
        System.out.println("Twoja cyfra to " + number);
        if (number < 0) {
            System.out.println("Cyfra jest ujemna");
        } else {
            System.out.println("Cyfra jest dodatnia");
        }
    }
}
