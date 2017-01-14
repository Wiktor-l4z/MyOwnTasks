package zadania;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ile masz lat");
        int lata = sc.nextInt();
        if (lata >= 18){
            System.out.println("Jestes osoba pelnoletnia!");
        } else {
            System.out.println("Nie mozesz korzystac z tego servisu");
        }
    }
}