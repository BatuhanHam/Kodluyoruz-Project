package PalindromSayi;

import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        int sayi;
        int temp;
        int kalan;
        int yeniSayi = 0;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        sayi = klavye.nextInt();
        temp = sayi;

        while (temp > 0) {
            kalan = temp % 10;
            yeniSayi = yeniSayi * 10 + kalan;
            temp = (temp - kalan) / 10;
        }
        if (sayi == yeniSayi || sayi < 10)
            System.out.print("Girilen Sayı polindrom Sayıdır.");

        else
            System.out.print("Girilen sayı polindrom sayı değildir.");


    }

}
