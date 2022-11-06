package YildizElmasYapim;

import java.util.Scanner;

public class YildizElmasYapim {
    public static void main(String[] args) {

        int adimSayisi ;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Adım sayısını giriniz : ");
        adimSayisi = klavye.nextInt();
        while (adimSayisi<=0){
            System.err.print("Adım sayısı negatif olamaz.Tekrar giriniz. ");
            adimSayisi = klavye.nextInt();
        }

        for (int i = 1; i <=adimSayisi ; i++) {
            for (int j = 1; j <=adimSayisi-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = adimSayisi-1; i >=1 ; i--) {
            for (int j = adimSayisi-i; j >=1; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i)-1; k>= 1; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
