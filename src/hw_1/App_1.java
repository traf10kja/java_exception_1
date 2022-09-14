package hw_1;

import java.util.Arrays;

public class App_1 {
    public static void main(String[] args) {
        int[] array_1 = {2, 6, 8, 10, 22};
        int[] array_2 = {1, 5, 1, 7, 5};

        String[][] strings = {{"555","777","2","4","7"},{"123","222","333","22",}};
        System.out.println(sum2d(strings));


        System.out.println(Arrays.toString(arrayDif(array_1, array_2)));
        System.out.println(Arrays.toString(arrayDivide(array_1, array_2)));

    }

    public static void method_1() {
        int a = 10 / 0;
    }

    public static void method_2() {
        int[] arr = new int[10];
        arr[100] = 1;
    }

    public static void method_3() {
        String str = null;
        System.out.println(str.length());
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
        /* В строке 37 мы можем получить NumberFormatException, если в массиве String не будут указаны числа.
           Из-за того что в строке 36 строго указана длина 5, мы получим ArrayIndexOutOfBoundsException.
         */

    }


    public static int[] arrayDif(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Bad size");
        }

        int[] res = new int[arr1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr1[i] - arr2[i];
        }
        return res;
    }

    public static int[] arrayDivide(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Bad size");
        }


        int[] res = new int[arr1.length];
        for (int i = 0; i < res.length; i++) {
            if (arr2[i] == 0){
                throw new RuntimeException("Сannot be divided by zero");
            }
            res[i] = arr1[i] / arr2[i];
        }
        return res;
    }


}
