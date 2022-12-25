package DiziCiftTekrar;

import java.util.Arrays;
import java.util.Scanner;

public class DiziTekrar {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Giriniz : ");
        int n = klavye.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int counter = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length - 1; j++) {
                if ((list[i] % 2 == 0 && list[j] % 2 == 0)) {

                    if ((list[i] == list[j])) {
                        counter++;

                        if (counter == 1) {
                            System.out.print(list[i] + " ");
                        }

                    } else if (list[i] != list[i + 1]) {
                        counter = 0;
                    }

                }
            }

        }
    }
}
