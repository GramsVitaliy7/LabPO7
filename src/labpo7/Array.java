/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo7;

import java.util.Arrays;

/**
 *
 * @author VITGR
 */
public class Array {

    private int[][] value;

    Array(int[][] value) {
        this.value = value;
    }

    public int[][] replaceSpecialColums() {
        int[][] transformedArray = Arrays.copyOf(value, value.length);
        int height = transformedArray.length;
        int width = transformedArray[0].length;
        int maxNegative = transformedArray[0][0];
        int minPositive = transformedArray[0][0];
        int columWithMaxNegative = 0;
        int columWithMinPositive = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((Math.abs(transformedArray[i][j]) > Math.abs(maxNegative)) && (transformedArray[i][j] < 0)) {
                    maxNegative = transformedArray[i][j];
                    columWithMaxNegative = j;

                }
                if ((Math.abs(transformedArray[i][j]) < Math.abs(minPositive)) && (transformedArray[i][j] > 0)) {
                    minPositive = transformedArray[i][j];
                    columWithMinPositive = j;
                }
            }
        }
        int buffer;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == columWithMaxNegative) {
                    buffer = transformedArray[i][j];
                    transformedArray[i][j] = transformedArray[i][columWithMinPositive];
                    transformedArray[i][columWithMinPositive] = buffer;
                }
            }
        }

        // for (int i=0; i<transformedArray.)
        return transformedArray;
    }
}
