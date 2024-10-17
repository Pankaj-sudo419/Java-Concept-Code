package com.sorting;
public class BubbleSort {

    public static void main(String[] args) {

//      timecomplexity: n	 worst timecomplexity : n2	  avg timecomplexity: n2	 space complexity 1

        int[] arr = {2,3,6,8,1};
        bubbleSort(arr);

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    public static void bubbleSort(int[] arr){
        boolean swaped;
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            swaped = false;
            for (int j=0;j<n-i-1;j++){
               if(arr[j]>arr[j+1]){
                  int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swaped = true;
               }
            }

            if(swaped == false){
                break;
            }
        }


    }
}
