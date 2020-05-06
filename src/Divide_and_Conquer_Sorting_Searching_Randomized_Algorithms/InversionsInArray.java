package Divide_and_Conquer_Sorting_Searching_Randomized_Algorithms;

public class InversionsInArray {
	public static void main(String args[]) {
		System.out.println(sortAndCount(new int[] {5,4,1,6,7,2},0,5));
	}
	
	public static int sortAndCount(int[] nums, int l, int r) {
		int count = 0;
		if(l<r)
		{
			int mid = l + (r-l)/2;
			count += sortAndCount(nums,l,mid);
			count += sortAndCount(nums,mid+1,r);
			count += mergeAndCount(nums,l,mid,r);
		}
		return count;
	}
	
	public static int mergeAndCount(int[] nums , int l, int mid, int r) {
		int ln = mid - l + 1;
		int rn = r - mid;
		int count = 0;
		int[] leftArray = new int[ln];
		int[] rightArray = new int[rn];
		for(int i = 0;i<ln;i++) {
			leftArray[i] = nums[i];
		}
		for(int i=0;i<rn;i++) {
			rightArray[i] = nums[mid+i+1];
		}
		int i=0,j=0,k=l;
		while(i<ln && j<rn) {
			if(leftArray[i] > rightArray[j]) {
				nums[k++] = rightArray[j++];     //1,2,3,4,    5,6,7,8    1,2,3,4
				count += (ln - i);
			}
			else
				nums[k++] = leftArray[i++];
		}
		
		while(i<ln) {
			nums[k++] = leftArray[i++];
		}
		while(j<rn) {
			nums[k++] = rightArray[j++];
		}
		
		return count;
	}
}
