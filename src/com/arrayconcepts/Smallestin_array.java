package com.arrayconcepts;
public class Smallestin_array {
    public static void main(String[] args) {
        int[] array = {55, 60, 43,1, 21, 32, 7};
        int smallest = array[0];
        for (int i = 1; i <array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        System.out.println("smallest number in array is :" + smallest);
    }
}
