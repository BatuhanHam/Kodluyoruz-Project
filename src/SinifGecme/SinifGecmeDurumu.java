package SinifGecme;

import java.util.Arrays;
import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int dersSayisi;
        double ort;
        double toplam = 0;
        int gecmeNotu = 55;


        Scanner klavye = new Scanner(System.in);
        System.out.print("Ders Sayısını giriniz : ");
        dersSayisi = klavye.nextInt();

        String[] dersler = new String[dersSayisi];
        int[] puanlar = new int[dersSayisi];




        for (int i = 0; i < dersSayisi; i++) {
            System.out.print("\n"+(i+1)+"." + "Ders adını girin : ");
            String dersAdi = klavye.next();
            dersler[i] = dersAdi;

            System.out.print((i+1)+"." + "Ders notunu girin : ");
            int puan = klavye.nextInt();
           while (puan<0 || puan>100){
               System.err.println("Geçersiz puan girdiniz.Tekrar deneyin.");
               puan = klavye.nextInt();

           }

            puanlar[i] = puan;
            toplam +=puan;

        }

        System.out.println();
        for (int i = 0; i <dersSayisi; i++) {
            System.out.println(dersler[i] + " dersinin  notu : " + puanlar[i]);

        }

        ort = toplam/dersSayisi;


        if (ort>= gecmeNotu)
            System.out.println("\n"+"Geçme notu 55 "+"Ortalamanız :"+ String.format("%.2f",ort)+ " TEBRİKLER.SINIFI GEÇTİNİZ");
        else
            System.out.println("\n"+"Geçme notu 55 "+"Ortalamanız : " + String.format("%.2f",ort)+ " MAALESEF.SINIFTA KALDINIZ.");




    }
}
