package MukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;

        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi = klavye.nextInt();

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam +=i;
            }
        }
        if (toplam == sayi)
            System.out.println(sayi +" Sayısı Mükemmel Sayıdır.");
        else
            System.out.println(sayi +" Sayısı Mükemmel Sayı Değildir.");

    }
}
