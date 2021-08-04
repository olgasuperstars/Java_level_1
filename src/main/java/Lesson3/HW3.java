package Lesson3;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
// 1 задание
        int[] nullVsOne = new int[5];
        nullVsOne[0] = 0;
        nullVsOne[1] = 0;
        nullVsOne[2] = 1;
        nullVsOne[3] = 1;
        nullVsOne[4] = 1;

            for (int i = 0; i < nullVsOne.length; i++)
            if (nullVsOne[i] == 1) {
                nullVsOne[i] = 0;
            }
            else {
                nullVsOne[i] = 1;
            }
        for (int i = 0; i < nullVsOne.length; i++)
            System.out.print(nullVsOne[i]);
        System.out.println();
// 2 задание
        int[] hundred = new int[100];
        for (int i = 0; i < 100; i++) {
            hundred[i] = i+1;
        }
        for (int i = 0; i < hundred.length; i++)
        {
            System.out.print(hundred[i]);
        }
        System.out.println();
// 3 задание
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        System.out.print(arr[i]);}
// 4 задание
        int [][] twoDimArr = new int [5][5];
        twoDimArr[0][0] = 1;
        twoDimArr[1][1] = 1;
        twoDimArr[2][2] = 1;
        twoDimArr[3][3] = 1;
        twoDimArr[4][4] = 1;
        for (int i=0; i < twoDimArr.length; i++) {
            for(int j=0; j < twoDimArr[i].length; j++)
            System.out.print(twoDimArr[i][j]+" ");
        }System.out.println();
        {

        }



// 5 задание
        System.out.println(Arrays.toString(arrFill(10, 12)));

    }
    public static int[] arrFill(int len, int initialValue) {
        int[] result = new int[len];
        Arrays.fill(result, initialValue);
        return result;
    }

}
