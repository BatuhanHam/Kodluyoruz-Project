package GelismisHesapMekinesi;

import java.util.Scanner;

public class GelismisHesapMekinesi {
    public static final String ANSI_MAVI = "\u001B[34m";
    public static final String ANSI_SIYAH = "\u001B[30m";

    static int toplama(int a,int b){
        int sonuc=a+b;
        System.out.println(ANSI_MAVI+"Toplam : "+ sonuc);
        return sonuc;
    }

    static int cikarma(int a, int b){
        int sonuc=a-b;
        System.out.println(ANSI_MAVI+"Çıkarma : "+ sonuc);
        return sonuc;
    }

    static int carpma(int a, int b){
        int sonuc=a*b;
        System.out.println(ANSI_MAVI+"Çarpım : "+ sonuc);
        return sonuc;
    }

    static double bolme(double a, double b){
        if (b==0) {
            System.out.println("İkinci sayı 0'dan farklı olmalıdır.");
            return 0;
        }
        double sonuc=a/b;
        System.out.println(ANSI_MAVI+"Bölüm : "+ String.format("%.2f",sonuc));
        return sonuc;
    }

    static int ustAlma(int a, int b){
        int sonuc=1;
        for (int i=1; i<=b; i++){
            sonuc*=a;
        }
        System.out.println(ANSI_MAVI+"Sayının Kuvveti : "+ sonuc);
        return sonuc;
    }

    static int mod(int a, int b){
        int sonuc = a%b;
        System.out.println(ANSI_MAVI+"Sayının modu : " + sonuc);
        return sonuc;
    }

    static double hipostenus(double a, double b){
        double sonuc = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(ANSI_MAVI+"Hipotenüs : "+ String.format("%.1f",sonuc));
        return sonuc;
    }

    public static void main(String[] args) {
        int select;
        Scanner klavye = new Scanner(System.in);


        String menu = "1-Toplama işlemi\n"
                    + "2- Çıkarma işlemi\n"
                    + "3-Çarpma işlemi\n"
                    + "4-Bölme işlemi\n"
                    + "5-Üslü sayı hesaplama\n"
                    + "6-Mod alma\n"
                    + "7-Hipotenüs hesaplama\n"
                    + "0-Çıkış yap";

        System.out.println(menu);

        while (true) {
            System.err.print("Yapmak İstedeğiniz İşlemi Seçiniz :");
            select = klavye.nextInt();
            if (select ==0){
                System.out.println("Çıkış Yaptınız.");
                break;
            }

            System.out.print(ANSI_SIYAH+"İlk Sayıyı Giriniz : ");
            int a = klavye.nextInt();
            System.out.print(ANSI_SIYAH+"İkinci Sayıyı Giriniz :");
            int b = klavye.nextInt();

            switch (select) {
                case 1:
                    toplama(a, b);
                    break;

                case 2:
                    cikarma(a, b);
                    break;

                case 3:
                    carpma(a, b);
                    break;

                case 4:
                    bolme(a, b);

                    break;

                case 5:
                    ustAlma(a, b);
                    break;

                case 6:
                    mod(a, b);
                    break;

                case 7:
                    hipostenus(a,b);
                    break;

                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");
            }
        }



    }
}
