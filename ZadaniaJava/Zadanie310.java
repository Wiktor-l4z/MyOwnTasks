public class Zadanie310 {
    public static void main(String[] args) {

        int i = 0;
        int suma = 0;
        for (i = 0; i <= 100; i++) {
            if (i%2 == 0)
                suma = suma + i;
            System.out.println(i);
            System.out.println("Wyswietlenie sumy tylko parzystych cyfr " + suma);
        }
    }
}
