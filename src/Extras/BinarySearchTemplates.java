package Extras;

public class BinarySearchTemplates {
	
	public static void main(String args[]) {
		System.out.println("binarySearchSpaceOne output:" + binarySearchSpaceOne(new int[] {1,2,4,5,6,7,8}, 8));
		System.out.println("binarySearchSpaceTwo output:" + binarySearchSpaceTwo(new int[] {1,2,4,5,6,7,8}, 8));
		System.out.println("binarySearchSpaceThree output:" + binarySearchSpaceThree(new int[] {1,2,4,5,6,7,8}, 8));
	}



public static int binarySearchSpaceOne(int[] nums,int target) {
	int left = 0, right = nums.length - 1;
	while(left <= right) {
		int mid = left + (right - left)/2 ;
		if(nums[mid] == target)
			return mid;
		else if(nums[mid] > target)
			right = mid - 1;
		else
			left = mid + 1;
	}
	return -1;
}

public static int binarySearchSpaceTwo(int[] nums,int target) {
	int left = 0, right = nums.length - 1;
	while(left < right) {
		int mid = left + (right - left)/2 ;
		if(nums[mid] == target)
			return mid;
		else if(nums[mid] > target)
			right = mid;
		else
			left = mid + 1;
	}	
	if(nums[right] == target) return right;
	return -1;
}

public static int binarySearchSpaceThree(int[] nums,int target) {
	int left = 0, right = nums.length - 1;
	while(left <= right) {
		int mid = left + (right - left)/2 ;
		if(nums[mid] == target)
			return mid;
		else if(nums[mid] > target)
			right = mid - 1;
		else
			left = mid + 1;
	}	
	if(nums[left] == target) return left;
	if(nums[right] == target) return right;
	return -1;
}

}