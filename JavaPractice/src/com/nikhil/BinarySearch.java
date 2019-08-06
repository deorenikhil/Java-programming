package com.nikhil;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
		System.out.println(findTarget(arr, 11));

	}
	public static int findTarget(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;

		int result = searchEle(start, end,target,arr);
		return result;
	}
	
	public static int searchEle(int start, int end,int target, int[] arr) {
		int mid = ((end - start)/2 + 1);
		if(arr[mid] == target) {
			return mid;
		}else if(target < arr[mid]) {
			return searchEle(start,mid-1,target,arr);
		}else {
			return searchEle(mid+1, end,target,arr);
		}
	}

}
