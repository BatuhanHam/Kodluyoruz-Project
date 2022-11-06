package BasamakSayiToplam;

import java.util.Scanner;

public class BasamakSayiToplam {
    public static void main(String[] args) {
        int sayi ;
        int basamakDeger;
        int toplam = 0;

        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi = klavye.nextInt();

        System.out.print(sayi+" sayısının basamak değerleri : ");
        while (sayi!=0){
            basamakDeger = sayi%10;
            System.out.print(basamakDeger + " ");
            toplam+=basamakDeger;
            sayi /=10;
        }
        System.out.print("\n"+"Basamak değerlerinin toplamı : "+toplam);
    }
}
