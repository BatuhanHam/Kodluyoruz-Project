package EtkinlikOnerme;

import java.util.Random;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int sicaklik;
        Random sayi =new Random();
        sicaklik = sayi.nextInt(50);  //Türkiye'de görülen en yüksek sıcaklık Şırnak ile 49°C.


        System.out.println("Hava sıcaklığı : " + sicaklik + "°C");

        if (sicaklik <5)
            System.out.println("Kayak yapılabilir.");

        else if (sicaklik <=25){
            
            if (sicaklik <=15)
                System.out.println("Sinemaya gidebilir.");

            if (sicaklik >=10)
                System.out.println("Pikniğe gidebilir.");
        }

        else
            System.out.println("Yüzmeye gidilebilir.");
    }
}
