import java.util.Random;

public class Zadanie316 {


    public static void main(String[] args) {

        int ilosc_liczb = 5, i;
        double liczba, suma = 0, min, max;
        System.out.println("Program losuje " + ilosc_liczb + " liczb całkowitych od 0 do 99,");
        System.out.println("a następnie znajduje najmniejszą i największą");
        System.out.println("oraz oblicza średnia ze wszystkich wylosowanych liczb.");
        Random r = new Random();
        min = Math.round(100 * (r.nextDouble()));
        System.out.println();
        System.out.print("Wylosowano liczby: " + min + ", ");
        max = min;
        suma = suma + max;
        for (i = 1; i <= ilosc_liczb - 1; i++) {
            liczba = Math.round(100 * (r.nextDouble()));
            System.out.print(liczba + ", ");
            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;
            suma = suma + liczba;
        }
        System.out.println();
        System.out.println("największa liczba to " + max + ",");
        System.out.println("najmniejsza liczba to " + min + ",");
        System.out.println("średnia = " + suma / ilosc_liczb + ".");
    }
}