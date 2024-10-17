package com.specialconcept;

import java.util.*;
public class Solution {
    public static int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);

        for(int i = 0; i<nums.length;i++){
            sum += nums[i];
            int dif = sum - k;

            if(hm.containsKey(dif)){
                count += hm.get(dif);
            }

            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,-4,9,-3} ;
        int k = 3;
//        int res = subarraySum(arr,k);
//        System.out.println(res);
        List<String> timePoints = Arrays.asList("23:59","00:00");
        int res = findMinDifference(timePoints);
        System.out.println(res);
    }

    public static int findMinDifference(List<String> timePoints) {
        int[] convertedMinute = new int[timePoints.size()];

        // Convert each time point into minutes
        for (int i = 0; i < timePoints.size(); i++) {
            String[] timeParts = timePoints.get(i).split(":"); // Split the time into hours and minutes
            int hours = Integer.parseInt(timeParts[0]); // Convert hours to integer
            int minutes = Integer.parseInt(timeParts[1]); // Convert minutes to integer

            // Convert total time into minutes
            int totalMinutes = hours * 60 + minutes;
            convertedMinute[i] = totalMinutes;
            System.out.println("Converted " + timePoints.get(i) + " to minutes: " + totalMinutes);
        }

        // Sort the converted minutes for easier comparison
        Arrays.sort(convertedMinute);

        // Calculate the minimum difference between consecutive time points (circular case too)
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < convertedMinute.length; i++) {
            int diff = convertedMinute[i] - convertedMinute[i - 1];
            minDiff = Math.min(minDiff, diff);
        }

        // Handle the circular case (e.g., difference between "23:59" and "00:00")
        int circularDiff = (1440 - convertedMinute[convertedMinute.length - 1]) + convertedMinute[0];
        minDiff = Math.min(minDiff, circularDiff);

        return minDiff;
    }

   
}