package ArmstrongSayi;

import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {

        int sayi ;
        int basamakSayisi ;
        int sayac=0;
        int basamakDegeri;
        int basPow;
        int toplam = 0;


        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        sayi = klavye.nextInt();

        int tempNumber = sayi;

        while (tempNumber!=0){        // basamak sayısı bulma işlemi.
            tempNumber/=10;
            sayac++;
        }
        tempNumber = sayi;
        basamakSayisi = sayac;

        while (tempNumber!=0){
            basamakDegeri = tempNumber%10;
            basPow=1;

            for (int i = 1; i <=basamakSayisi; i++) {
                basPow*=basamakDegeri;
            }
            toplam+=basPow;
            tempNumber/=10;
        }
        if (toplam == sayi)
            System.out.println(sayi + " Sayısı bir Armstrong sayıdır.");
        else
            System.out.println(sayi + " Sayısı bir Armstrong sayı değildir.");
    }
}
