import java.util.Scanner;

public class Zadanie17{
    public static void main(String[] args) {


        float x,y,suma,roznica,iloraz,iloczyn;


        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cyfre x");
        x = klawiatura.nextInt();
        System.out.println("Podaj cyfre y");
        y = klawiatura.nextInt();


        suma = x+y;
        roznica = x-y;
        iloczyn = x/y;
        iloraz = x*y;

        System.out.printf("Suma x+y " + "%2.2f,\n", + suma);
        System.out.printf("Roznica x-y " + "%2.2f,\n", + roznica);
        System.out.printf("Iloczyn x/y " + "%2.2f,\n", + iloczyn);
        System.out.printf("Iloraz x*y " + "%2.2f,\n", + iloraz);



    }
}
