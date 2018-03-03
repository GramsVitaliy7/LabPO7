/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo7;

import java.util.Scanner;

/**
 *
 * @author VITGR
 */
public class LabPO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int arrayHeight = scanner.nextInt();
        System.out.println("Введите количество столбцов");
        int arrayWidth = scanner.nextInt();
        int[][] array = new int[arrayHeight][arrayWidth];
        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth; j++) {
                System.out.println("Введите элемент (" + i + ";" + j + ")");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Исходный массив");
        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        Array newArray = new Array(array);
        int[][] newArray2 = newArray.replaceSpecialColums();

        System.out.println("Преобразованный массив");
        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth; j++) {
                System.out.print(newArray2[i][j] + "  ");
            }
            System.out.println("");
        }
    }

}
