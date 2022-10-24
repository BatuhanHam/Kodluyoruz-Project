package VucutKitleİndeksi;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy,kilo;
        double kitleIndeksi;

        Scanner klavye = new Scanner(System.in);
        do {
            System.out.print("Boy uzunluğunuzu metre cinsinden giriniz : ");
            boy = klavye.nextDouble();
        }while (boy<0); // Dünyanın en uzun insanı 2.51 metre.

        System.out.print("Kilonuzu giriniz : ");
        kilo = klavye.nextDouble();

        while (kilo<0){
            System.err.print("Kilo değeri negatif olamaz.Tekrar giriniz.");
            kilo = klavye.nextDouble();
        }


        kitleIndeksi = kilo/Math.pow(boy,2);
        System.out.println("Vücut kitle indeksiniz : " + String.format("%.2f", kitleIndeksi));

        if (kitleIndeksi <18.5)
            System.out.println("Vücut kitle indeksine göre zayıf birey.");

        else if (kitleIndeksi >18.5 && kitleIndeksi <24.9)
            System.out.println("Vücut kitle indeksine göre normal kiloda birey.");

        else if (kitleIndeksi >25 && kitleIndeksi <29.9)
            System.out.println("Vücut kitle indeksine göre fazla kilolu birey.");

        else if (kitleIndeksi >30 && kitleIndeksi <39.9)
            System.out.println("Vücut kitle indeksine göre obez birey.");

        else
            System.out.println("Vücut kitle indeksine göre ileri derece obez birey.");



    }
}
