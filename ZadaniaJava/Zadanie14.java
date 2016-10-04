import java.util.Scanner;


public class Zadanie14 {
    public static void main(String[] args) {


            double r, objetosc;

            Scanner klawiatura = new Scanner(System.in);
            System.out.println("Program oblicza objętość kuli.");
            System.out.println("Podaj promień r.");
            r = klawiatura.nextInt();
            objetosc = 4.0*Math.PI*r*r*r/3;
            System.out.print("Objętość kuli o promieniu r = ");
            System.out.printf("%2.2f", r);
            System.out.print(" wynosi ");
            System.out.printf("%2.2f.", objetosc);
        }
    }