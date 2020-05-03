package Divide_and_Conquer_Sorting_Searching_Randomized_Algorithms;

import java.util.Arrays;

public class MergeSort {
	public static void main(String args[]) {
		System.out.println(Arrays.toString(mergeSort(new int[] {3,2,4,1,8,9,6,7})));
	}
	
	public static int[] mergeSort(int[] nums) {
		int n = nums.length;
		if(n<2)
			return nums;
		int n1 = n/2,n2= n-n1;
		int leftArray[] = new int[n1],rightArray[] = new int[n2];
		for(int i=0; i<n1;i++)
		{
			leftArray[i] = nums[i];
		}
		for(int i=0;i<n2;i++) {
			rightArray[i] = nums[i+n1];
		}
		return merge(mergeSort(leftArray),mergeSort(rightArray),n1,n2);	
	}
	
	public static int[] merge(int[] l, int[] r,int ln,int rn) {
		int retArray[] = new int[ln+rn];
		int j=0,k=0;
		for(int i=0;i<ln+rn;i++) {
			if(j>=ln)
				retArray[i] = r[k++];
			else if(k>=rn)
				retArray[i] = l[j++];
			else if(l[j]>r[k])
				retArray[i] = r[k++];
			else if(l[j]<r[k])
				retArray[i] = l[j++];
		}
		return retArray;
	}
}
