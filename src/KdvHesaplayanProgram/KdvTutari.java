package KdvHesaplayanProgram;

import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {

       double urunFiyat;
       Scanner klavye = new Scanner(System.in);
        System.out.print("Ürün fiyatını giriniz : ");
        urunFiyat = klavye.nextDouble();

        double kdvOran = urunFiyat<1000 ? 0.18 : 0.08;
        double kdvliFiyat = (urunFiyat + (urunFiyat*kdvOran));

        System.out.println("Ürün fiyatı : " + urunFiyat);
        System.out.println("Ürün KDV'li fiyatı : " + kdvliFiyat);
        System.out.println("Uygulanan KDV oranı : " + kdvOran);







    }
}
