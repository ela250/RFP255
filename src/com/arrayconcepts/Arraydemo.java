package com.arrayconcepts;

public class Arraydemo {
    public static void main (String[] args){
        int[] array = { 1,2,3,44,5,6,7 };

        //to print all elements in array
        for(int i=0; i<array.length; i++){
            System.out.println(array[i] +"");
        }
        //to print sum of array
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum=sum+array[i];
        }
        System.out.println(sum +"is sum of all the array elements");
    }

}
