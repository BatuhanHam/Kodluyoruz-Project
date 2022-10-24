package DaireDilimininAlani;

import java.util.Scanner;

public class DaireDilimAlani {
    public static void main(String[] args) {
        int yariCap;
        double pi = 3.14;
        double aci;
        double dilimAlan;
        Scanner klavye = new Scanner(System.in);


        do {
            System.out.print("Yarıçap uzunluğunu pozitif olarak giriniz:");
            yariCap = klavye.nextInt();
        }while(yariCap<0);

        do {
            System.out.print("Daire diliminin açı değerini giriniz : ");
            aci = klavye.nextInt();
        }while (aci<0);

        dilimAlan = pi*aci*Math.pow(yariCap,2)/360;

        System.out.print("Daire diliminin alanı : " + String.format("%.2f",dilimAlan));

    }
}
