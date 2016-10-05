import java.util.Random;
import java.util.Scanner;

public class Zadanie25 {
    public static void main(String[] args) {


        double losuj_liczbe, zgadnij_liczbe;



        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Program losuje liczbę z przedziału od 0 do 9. ");
        System.out.println("Zgadnij tę liczbę.");
        Random r = new Random();
        losuj_liczbe = Math.round(10 * (r.nextDouble()));
        zgadnij_liczbe = klawiatura.nextInt();
            if (zgadnij_liczbe == losuj_liczbe) {
            System.out.println("Gratulacje! Odgadłeś liczbę!");
        } else {
            System.out.print("Bardzo mi przykro, ale wylosowana liczba to ");
            System.out.println((int) losuj_liczbe + ".");
        }
    }
}
