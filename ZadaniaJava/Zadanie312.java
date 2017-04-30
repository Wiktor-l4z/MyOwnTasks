public class Zadanie312 {
    public static void main(String[] args) {
        int i = 0;
        int suma = 0;
        while (i <= 100) {
            if (i % 2 == 0)
                suma = suma + i;
            i++;
        }
        System.out.println(suma);
    }
}
