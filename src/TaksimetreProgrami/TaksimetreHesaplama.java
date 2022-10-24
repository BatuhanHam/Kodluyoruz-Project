package TaksimetreProgrami;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double km , total;
        double startPrice = 10;
        double perKm = 2.20 ;   //Kilometre başına ödenen ücret.

        Scanner klavye = new Scanner(System.in);
        System.out.print("Mesafeyi kilometre cinsinden giriniz : ");
        km = klavye.nextDouble();

        while(km<0){
            System.err.print("Km negatif olamaz. Tekrar Giriniz : ");
            km = klavye.nextDouble();
        }

        total = startPrice+(km*perKm);
        total = (total<20) ? 20 : total;

        System.out.println("Gidilen yol : " + km + " KM");
        System.out.println("Kilometrede uygulanan tarife : " + perKm +" TL");
        System.out.println("Toplam ödenecek tutar : " + total + " TL");



    }
}
