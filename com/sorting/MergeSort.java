package com.sorting;

public class MergeSort {
    public static void main(String[] args) {
        // timecomplexity: nlog n  worst timecomplexity :nlog n	 avg timecomplexity: nlog n	 space complexity n

        int[] arr = {2,3,6,8,1};
        sort(arr,0,arr.length-1);
        printarr(arr);

    }

    public static void sort(int[] arr, int l, int r){
        if(l<r){
            int m = l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r){

        int[] merged = new int[r - l + 1];

        int i = l;
        int j = m+1;
        int k = 0;
        while (i<=m && j<=r){
            if(arr[i] <= arr[j]){
                merged[k++] = arr[i++];
            }
            else{
                merged[k++] = arr[j++];
            }

        }

        while(i <= m){
            merged[k++] = arr[i++];
        }

        while(j <= r){
            merged[k++] = arr[j++];
        }

        for (int x=0;x<merged.length;x++) {
            arr[l++] = merged[x];
        }

    }

    public static void  printarr(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }


}
