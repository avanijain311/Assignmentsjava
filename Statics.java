package com.monocept.work;

import java.util.*;

public class Statics {
	public static void main(String[] args) {
		int arr[] =new int [args.length];
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.valueOf(args[i]);
		}
		int sum=0;
		
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
			min = Math.min(arr[i],min);
			max = Math.max(arr[i],max);
		}
		double average = sum/n;
		int median =0;
		Arrays.sort(arr);
		if(n%2==0) {
			median=(arr[(n/2)-1]+arr[n/2]);
		}
		else {
			median=(arr[(n+1)/2]-1);
		}
		Map<Integer, Integer> map= new HashMap<>();
		for(int i : arr) {
			map.merge(i, 1, Integer::sum);
		}
		
		System.out.println("Sum is " + sum);
		System.out.println("Minimum is " + min);
		System.out.println("Maximum is " + max);
		System.out.println("Average is " + average);
		System.out.println("Median is " + median);
		System.out.println("Frequency of each number in the array is" + map);
		
	}
}
