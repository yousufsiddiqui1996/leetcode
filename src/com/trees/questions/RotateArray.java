package com.trees.questions;
/*
    Problem: Rotate an array of n elements to the right by k steps.
    For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {
    public int[] rotateArray(int nums[], int k){
       if(k<nums.length){
           k = k%nums.length;
       }
       int[] result = new int[nums.length];
       for(int i=0;i<k;i++){
           result[i] = nums[nums.length-k+i];
       }
       int j = 0;
       for (int i=k; i< nums.length-k;i++){
           result[k] = nums[i];
       }

    return result;
    }
}
