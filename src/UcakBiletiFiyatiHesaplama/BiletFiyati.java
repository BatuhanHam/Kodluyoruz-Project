package UcakBiletiFiyatiHesaplama;

import java.util.Scanner;

public class BiletFiyati {
    public static void main(String[] args) {
        int mesafe;
        double perKm = 0.10;
        int yas;
        double toplamTutar = 0;
        double indirimliTutar = 0;
        double yasIndirimliTutar =0;
        double yasIndirimi = 0;
        double odenecekNetTutar = 0;
        double tipIndirimi = 0;
        int yolculukTipi;


        Scanner klavye = new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi giriniz : ");
        mesafe = klavye.nextInt();
        while (mesafe < 0) {
            System.err.print("Hatalı değer girdiniz. ");
            mesafe = klavye.nextInt();
        }

        System.out.print("Yaşınızı giriniz : ");
        yas = klavye.nextInt();
        while (yas < 0) {
            System.err.print("Hatalı değer girdiniz.");
            yas = klavye.nextInt();
        }

        System.out.println("1-Tek Yön\n2-Gidiş Dönüş");
        System.out.print("Yolculuk tipini seçiniz : ");
        yolculukTipi = klavye.nextInt();

        while (yolculukTipi != 1 && yolculukTipi != 2) {
            System.err.println("Hatalı giriş yaptınız.");
            yolculukTipi = klavye.nextInt();

        }

        toplamTutar = mesafe * perKm;
        System.out.println("İndirimsiz ödenmesi gereken tutar : "+String.format("%.2f",toplamTutar)+ "TL");


        if (yas < 12 && yolculukTipi ==1){
            yasIndirimi = toplamTutar / 2;
            yasIndirimliTutar = toplamTutar - yasIndirimi;
            System.out.println("Yaş indirimli tutar : " +String.format("%.2f",yasIndirimliTutar));
            System.out.println("Ödenecek Net tutar :" +String.format("%.2f",yasIndirimliTutar)  + "TL");

        }
        else if (yas < 12 && yolculukTipi ==2) {
            yasIndirimi = toplamTutar / 2;
            yasIndirimliTutar = toplamTutar - yasIndirimi;
            System.out.println("Yaş indirimli tutar : " +yasIndirimliTutar +"TL");
            indirimliTutar = yasIndirimliTutar -(yasIndirimliTutar/5);
            System.out.println("Gidiş-dönüş bilet indirimli tutar : " + String.format("%.2f",indirimliTutar) + "TL");
            System.out.println("Ödenecek Net tutar :" + String.format("%.2f",indirimliTutar) + "TL");
        }

        if (yas>=12 && yas <= 24 && yolculukTipi==1) {
            yasIndirimi = toplamTutar / 10;
            yasIndirimliTutar = toplamTutar - yasIndirimi;
            System.out.println("Yaş indirimli tutar : " + String.format("%.2f",yasIndirimliTutar));
            System.out.println("Ödenecek Net tutar :" + String.format("%.2f",yasIndirimliTutar) + "TL");

        }
        else if (yas>=12 && yas <= 24 && yolculukTipi==2){
            yasIndirimi = toplamTutar / 10;
            yasIndirimliTutar = toplamTutar - yasIndirimi;
            System.out.println("Yaş indirimli tutar : " + yasIndirimliTutar);
            indirimliTutar = yasIndirimliTutar -(yasIndirimliTutar/5);
            System.out.println("Gidiş-dönüş bilet indirimli tutar : " +String.format("%.2f",indirimliTutar)  + "TL");
            System.out.println("Ödenecek Net tutar :" +String.format("%.2f",indirimliTutar)  + "TL");

        }

        if (yas >= 65 && yolculukTipi==1) {
            yasIndirimi = toplamTutar * 3 / 10;
            yasIndirimliTutar = toplamTutar - yasIndirimi;
            System.out.println("Yaş indirimli tutar : " +String.format("%.2f",yasIndirimliTutar) );
            System.out.println("Ödenecek Net tutar :" + String.format("%.2f",yasIndirimliTutar) + "TL");


        }
        else if (yas>=65 && yolculukTipi==2){
            yasIndirimi = toplamTutar * 3 / 10;
            yasIndirimliTutar = toplamTutar - yasIndirimi;
            System.out.println("Yaş indirimli tutar : " +String.format("%.2f",yasIndirimliTutar));
            indirimliTutar = yasIndirimliTutar -(yasIndirimliTutar/5);
            System.out.println("Gidiş-dönüş bilet indirimli tutar : " + String.format("%.2f",indirimliTutar)+"TL");
            System.out.println("Ödenecek Net tutar :" +String.format("%.2f",indirimliTutar)  + "TL");
        }


    }

}