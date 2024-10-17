package com.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        // timecomplexity: n^2  worst timecomplexity : n^2	 avg timecomplexity: n^2	 space complexity 1

        int[] arr = {2,3,6,8,1};
        selectionsort(arr);
        printarr(arr);
    }

    public static void selectionsort(int[] arr){
        int n = arr.length;
        for (int i=0; i< n-1; i++){
            int min_idx = i; //Find the minimum element in unsorted array

            for (int j=i+1; j<n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j; //Swap the found minimum element with the first element

                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void  printarr(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
