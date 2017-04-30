public class Zadanie314 {
    public static void main(String[] args) {

        int i = 0;
        int suma = 0;
        do {
            if (!(i%2 == 0))
                suma = suma + i;
                i++;

        } while (i <=100);
        System.out.println(suma);
    }
}
