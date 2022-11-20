package AsalSayi;

public class AsalSayi {
    public static void main(String[] args) {
        boolean asalMi = true;

        int sayi = 100, sayac;

        for (int i = 2; i <= sayi; i++) {
            sayac = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    sayac++;
                    break;
                }
            }
            if (sayac == 0) {
                System.out.print(i + " ");
            }

        }
    }
}