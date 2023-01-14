package MatrisTranspozu;

import java.util.Scanner;

public class Transpoze {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Satır Sayısını giriniz : ");
        int row = klavye.nextInt();

        System.out.print("\nSütun sayısını Giriniz : ");
        int column = klavye.nextInt();



        int[][] matris = new int[row][column];
        int[][] transpoze = new int[column][row];

        System.out.println("MATRİS ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                matris[i][j] = (int)(Math.random()*10);
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("\nTRANSPOZE ");

        for (int i = 0; i <column ; i++) {
            for (int j = 0; j < row; j++) {
                transpoze[i][j] = matris[j][i];

                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();

        }
    }
}
