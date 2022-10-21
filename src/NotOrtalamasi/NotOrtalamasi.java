package NotOrtalamasi;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner klavye = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz : ");
         mat=klavye.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik = klavye.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = klavye.nextInt();

        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = klavye.nextInt();

        System.out.println("Tarih notunuzu giriniz : ");
        tarih = klavye.nextInt();

        System.out.println("Müzik notunuzu giriniz : ");
        muzik = klavye.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ort = toplam/6.0;

        System.out.println("Ortalamanız : " + ort);

        String kontrol = (ort >= 50 ) ? "Sınıfı Geçti." : "Sınıfta kaldı.";
        System.out.println(kontrol);
    }
}
