package DiziElemanFrenkasi;

import java.util.Arrays;
import java.util.Scanner;

public class ElemanFrekansi {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Giriniz : ");
        int n = klavye.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));


        int counter = 1;
        int tempArray = list[0];
        int temp;
        for (int i = 0; i < list.length-1; i++) {
            temp = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]){
                    counter++;
                    temp++;
                }
            }
            System.out.println(list[i] + " sayısı " + counter + " tekrar etti");

            if (list[i+1] == list[list.length-1] && list[i+1] != list[list.length-2]){
                System.out.println(list[i+1] + " sayısı " + counter + " tekrar etti");
            }
            i = temp;
            counter = 1;
        }
    }
}
