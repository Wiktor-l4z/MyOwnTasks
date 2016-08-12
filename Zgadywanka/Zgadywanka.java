/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zgadywanka;

/**
 *
 * @author l4z
 */
public class Zgadywanka {

    Player p1;   // 3 skladowe sluzace do przechwytywania trzech obiektow gracz
    Player p2;
    Player p3;

    public void rozpocznijGre() {
        p1 = new Player(); // Utworzenie 3 obiektow Gracz i zapisanie ich w 3 skladowych
        p2 = new Player();
        p3 = new Player();

        int typp1 = 0;  // Deklaracja 3 zmiennych w ktorych beda przechowywane trzy liczby wytypowane przez graczy
        int typp2 = 0;
        int typp3 = 0;

        boolean p1odgadl = false;  // Deklaracja 3 zmiennych true/false w zaleznosci od odpowiedzi
        boolean p2odgadl = false;
        boolean p3odgadl = false;

        int liczbaOdgadywana = (int) (Math.random() * 10);  // wyznaczenie liczby jaka musi odgadnac gracz
        System.out.println("Mysle o liczbie z zakresu od 0 do 9.. ");

        while (true) {
            System.out.println("Nalezy wytypowac liczbe: " + liczbaOdgadywana);

            p1.zgaduj();  // Wywolanie metody zgaduj kazdego z graczy
            p2.zgaduj();
            p3.zgaduj();

            typp1 = p1.liczba;
            System.out.println("Gracz 1 strzela " + typp1);  // pobranie liczy wytypowanych przez kazdego
            // z graczy, odczytanych ze skladowych
            typp2 = p2.liczba;                                                                                  // obiektow graczy
            System.out.println("Gracz 2 strzela " + typp2);

            typp3 = p3.liczba;
            System.out.println("Gracz 3 strzela " + typp3);

            if (typp1 == liczbaOdgadywana) {
                p1odgadl = true;
            }
            if (typp2 == liczbaOdgadywana) {
                p2odgadl = true;
            }
            if (typp3 == liczbaOdgadywana) {
                p3odgadl = true;
            }
            if (p1odgadl || p2odgadl || p3odgadl) {
                System.out.println("Mamy zwyciezce!");
                System.out.println("Czy gracz pierwszy wytypował poprawnie? " + p1odgadl);
                System.out.println("Czy gracz drugi wytypował poprawnie? " + p2odgadl);
                System.out.println("Czy gracz trzeci wytypował poprawnie? " + p3odgadl);
                System.out.println("Koniec gry.");
                break;
            } else {
                System.out.println("Nikomu sie nie udalo, gracze beda musieli sprobowac jeszcze raz.");
            }
        }
    }
}
