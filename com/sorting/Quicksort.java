package com.sorting;

public class Quicksort {
    public static void main(String[] args) {
        // timecomplexity: nlog n  worst timecomplexity :n2	 avg timecomplexity: nlog n	 space complexity: nlog n

        int[] arr = {2,3,6,8,1};
        sort(arr,0, arr.length-1);
       printarr(arr);

    }

    public static int partition(int[] arr, int low, int high){
           int pivot = arr[high];
           int i = (low-1);
           for (int j=low; j<=high-1; j++){
               if(arr[j] < pivot){
                   i++;
                   swap(arr,i,j);
               }
           }
        swap(arr,i+1,high);
        return (i+1);
    }

    public static void sort(int[] arr, int low, int high){
          if(low<high){
             int  pi = partition(arr,low,high);
              sort(arr,low,pi-1);
              sort(arr,pi+1,high);
          }
    }

    public static void swap(int[] arr ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void  printarr(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
