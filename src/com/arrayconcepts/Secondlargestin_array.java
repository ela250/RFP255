package com.arrayconcepts;

public class Secondlargestin_array {
    public static void main(String[] args) {
        int[] array = {3,42, 10, 25, 11 , 45};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {//3>42 false
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("the second largest number :" + array[array.length - 2]);
    }
}

