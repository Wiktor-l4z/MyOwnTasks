package zadania;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Napisz cyfre x");
        int x = sc.nextInt();
        System.out.println("Twoja cyfra to " + x);
        System.out.println("Napisz cyfre y");
        int y= sc.nextInt();
        System.out.println("Cyfra x = "+ x + " Cyfra y = " + y );
        if (x > y){
            System.out.println("Cyfra x jest wieksza od y");
        } else {
            System.out.println("Cyfra y jest wieksza od x");
        }
        // System.out.println(x > y ? x : y);
    }
}
