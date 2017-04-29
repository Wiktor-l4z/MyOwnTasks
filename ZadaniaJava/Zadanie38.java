public class Zadanie38 {
    public static void main(String[] args) {

        int i = 0;
        int suma = 0;
        do {
            System.out.println(i);
            suma = suma + i;
            System.out.println("Liczy sume " + suma);
        } while (i++ < 100);
    }
}
