package zadania;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {

        Scanner imie = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        System.out.println();
        String a = imie.nextLine();

        char ost1 = a.charAt((a.length() - 1));

        String plec;

        if (ost1 == 'a') {
            plec = "kobiety";
        } else {
            plec = "mezczyzny";
        }
        System.out.println();
        System.out.println("Pierwsze imie " + a + " nalezy do " + plec + " i sklada sie z " + a.length() + " liter\n ");
    }
}

