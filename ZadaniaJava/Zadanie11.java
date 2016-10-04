import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {


double a,b,pole;



        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj bok a");
        a = klawiatura.nextInt();
        System.out.println("Podaj bok b");
        b = klawiatura.nextInt();

        System.out.println("Bok a = " +a);
        System.out.println("Bok b = " +b);
        pole = a*b;
        System.out.println("Pole prostokata wynosi a*b "+ pole);

    }
}
