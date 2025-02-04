package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return  arr;
        int lengthOfNewArray = 0;
        for (int x : arr){
            if (x <= 1000){
                lengthOfNewArray++;
            }
        }
        int[] newArray = new int[lengthOfNewArray];

        int i = -1;
        for (int x : arr){
            if (x <= 1000){
                i++;
                newArray[i] = x;
            }
        }
        return newArray;
    }

}