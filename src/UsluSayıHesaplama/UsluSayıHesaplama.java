package UsluSayıHesaplama;

import java.util.Scanner;

public class UsluSayıHesaplama {
    public static void main(String[] args) {
        int x,y;
        int toplam=1;

        Scanner klavye = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        x = klavye.nextInt();

        System.out.print("Üs olacak sayı :");
        y = klavye.nextInt();

       if (y>=0){
           for (int i = 1; i <=y ; i++) {
               toplam *=x;
           }
           System.out.print("Cevap : " + toplam);
       }
       else{
           for (int i = -1; i >=y ; i--) {
               toplam *=x;
           }
           System.out.print("Cevap : " +"1/"+toplam);

       }

    }
}
