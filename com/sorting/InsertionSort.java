package com.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        // timecomplexity: n  worst timecomplexity : n^2	 avg timecomplexity: n^2	 space complexity 1

        int[] arr = {2,3,6,8,1};
        insertionsort(arr);
        printarr(arr);


    }
    public static void insertionsort(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; i++){
            int j = i-1;
            int key = arr[i];

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key; // update key value
        }

    }

    public static void  printarr(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
