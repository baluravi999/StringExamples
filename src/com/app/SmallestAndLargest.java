package com.app;

import java.util.Arrays;

public class SmallestAndLargest {
  public static void main(String[] args) {
	int nums[]={-10,40,56,89,-60,79};
	int largest=nums[0];
	int smallest=nums[0];
	for(int i=1;i<nums.length;i++){
		if(nums[i]>largest){
			largest=nums[i];
		}
		else if(nums[i]<smallest){
			
			smallest=nums[i];
		}
	   
	System.out.println("the array elements are "+Arrays.toString(nums));
	System.out.println("the largest element is:"+largest);
	System.out.println("the smallest element is:"+ smallest);
}
  }}
