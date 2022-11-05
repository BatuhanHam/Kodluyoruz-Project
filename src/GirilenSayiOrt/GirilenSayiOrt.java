package GirilenSayiOrt;

import java.util.Scanner;

public class GirilenSayiOrt {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0, sayac = 0;
        int ort;


        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        sayi = klavye.nextInt();
        while (sayi<0){
            System.err.print("Pozitif sayı giriniz : ");
            sayi = klavye.nextInt();
        }


        for (int i = 1; i <= sayi; i++) {
            if (i % 12 == 0) {
                toplam += i;
                sayac++;

            }
        }

        System.out.println("Sayaç : " + sayac);
        System.out.println("Toplam :" + toplam);

        if (sayac!=0){
            ort = toplam / sayac;
            System.out.println("Ortalama : " + ort);
        }

    }
}

