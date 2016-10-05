import java.util.Scanner;


public class Zadanie21 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        int a,b,c;

        System.out.println("Podaj bok a");
        a = klawiatura.nextInt();
        System.out.println("Podaj bok b");
        b = klawiatura.nextInt();
        System.out.println("Podaj bok b");
        c = klawiatura.nextInt();
        if (a > 0 && b > 0 && c > 0) { if  ((a*a+b*b) == c*c) {
            System.out.println("Boki");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("Tworzą trójkąt prostokątny.");
        }
        else
        {
            System.out.println("Boki");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("Nie tworzą trójkąta prostokątnego.");
        }
        {

        }

        } else {
            System.out.println("To nie jest trójkąt");
        }

    }
}
