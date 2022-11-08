package EbobEkokBulma;

import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {

        int sayi1,sayi2;
        int i=1;
        int ebob=0;
        int ekok=0;

        Scanner klavye = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        sayi1 = klavye.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        sayi2 = klavye.nextInt();

        while (i<=sayi1 && i<=sayi2){
            if (sayi1%i==0 && sayi2%i==0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Girilen Sayıların EBOBU : "+ebob);

       while (i<=(sayi1*sayi2)){
           if (i%sayi1==0 && i%sayi2==0){
               ekok = i;
               break;
           }
           i++;
       }
        System.out.println("Girilen Sayıların EKOKU : "+ekok);



    }
}
