package ArtikYil;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;

        Scanner klavye = new Scanner(System.in);
        System.out.print("Yılı giriniz :");
        yil =klavye.nextInt();

        while (yil<0){
            System.err.println("Yıl negatif olmaz.Tekrar giriniz.");
            yil = klavye.nextInt();
        }

        if (yil%100==0 && yil%400 ==0){
            System.out.println(yil +" bir artık yıldır.");
        }
        else if (yil%100 !=0 && yil%4 ==0){
            System.out.println(yil + " artık bir yıldır.");
        }
        else
            System.out.print(yil + " artık yıl değildir");
    }
}
