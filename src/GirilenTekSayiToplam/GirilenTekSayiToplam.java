package GirilenTekSayiToplam;

import java.util.Scanner;

public class GirilenTekSayiToplam {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;


        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        sayi = klavye.nextInt();



       while (sayi%2==0){
           System.out.print("Sayı giriniz : ");
           sayi = klavye.nextInt();
           if (sayi%4==0){
               toplam +=sayi;

           }
       }
        System.out.println("Çift ve 4'ün Katı Olan Sayıların Toplamı : "+toplam);


    }

}
