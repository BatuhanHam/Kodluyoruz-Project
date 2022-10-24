package ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        int toplam = 0;
        Scanner klavye = new Scanner(System.in);
        String[] urun = {"armut", "elma", "domates", "muz", "patlıcan"};
        double[] kgFiyati = {2.14, 3.67, 1.11, 0.95, 5};

        double[] kilo= new double[5];
        for (int i = 0; i < kilo.length; i++) {
            System.out.print(urun[i] + " kaç kilo ? : " );
            kilo[i] = klavye.nextDouble();
        }

        double[] fiyat = new double[5];
        for (int i = 0; i < fiyat.length; i++) {
            fiyat[i] = kgFiyati[i] * kilo[i];
            System.out.println("\n" +urun[i] + " " +kilo[i] + " kilo alındı. Fiyatı : " + String.format("%.2f",fiyat[i]) + " TL");
            toplam += fiyat[i];
        }
        System.out.println("\n" +"Toplam Tutar : " + toplam + "TL");
    }
}
