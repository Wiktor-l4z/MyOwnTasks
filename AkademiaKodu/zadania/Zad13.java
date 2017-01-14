package zadania;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String haslo;
        do {
            System.out.println("Podaj haslo!");
            haslo = sc.next();
        } while (!haslo.equals("Akademia"));
        System.out.println("Poprawne haslo!");
    }
}

