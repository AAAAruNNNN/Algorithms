package Extras;

public class BinarySearchTemplates {
	
	public static void main(String args[]) {
		System.out.println("binarySearchSpaceOne output:" + binarySearchSpaceOne(new int[] {1,2,4,5,6,7,8}, 8));
		System.out.println("binarySearchSpaceTwo output:" + binarySearchSpaceTwo(new int[] {1,2,4,5,6,7,8}, 8));
		System.out.println("binarySearchSpaceThree output:" + binarySearchSpaceThree(new int[] {1,2,4,5,6,7,8}, 8));
	}


	/*
	 * Template #1:
	 * 			Key points:
	 * 				1. while(l<=r)
	 * 				2. l = mid + 1;
	 * 				3. r = mid - 1;
	 * 		
	 * 			Search space : 1
	 * 			loops till l == r and so all elements are covered, can't access next element if l = r = last element
	 * 															   can't access previous element if l = r = first element
	 * 			To increase search space use the other two templates
	 * 
	 * 			This template is used only when searching for exact element or when operations done only to mid element and 
	 * 				not other elements in the vicinity (immediate right or left) to mid element
	 */
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

	/*
	* Template #2:
	* 			Key points:
	* 				1. while(l<r)
	* 				2. l = mid + 1;
	* 				3. r = mid;
	* 				4. post processing (end condition): if(nums[right] == target)
	* 		
	* 			Search space : 2
	* 			loops till l < r , l == r is the termination condition
	* 				so, last element not checked yet which helps us with search space : 2 i.e., mid and mid+1 are always accessible
	* 				cannot access mid - 1 though , when l = mid = 0
	* 			Since the last element is not checked, nums[right] needs to be checked
	* 			
	* 			To increase search space use the third template
	* 
	* 			This template is used to search for an element or condition which requires 
	* 				accessing the current index(mid) and its immediate right neighbor's index in the array. 
	*/
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
	
	/*
	* Template #3:
	* 			Key points:
	* 				1. while(l+1<r)
	* 				2. l = mid;
	* 				3. r = mid;
	* 				4. Post Processing (end condition): if(nums[left] == target) return left;
	* 													if(nums[right] == target) return right;
	* 		
	* 			Search space : 3
	* 			loops till l+1 < r , element at l+1 and r are not checked
	* 				until l+1<r we can access mid -1, mid and mid+1 are always accessible, hence search space : 3 
	* 			
	* 			finally we are left with two unchecked elements left and right and hence we need to check them
	* 			This template is used to search for an element or condition which requires accessing the current 
	* 				index and its immediate left and right neighbor's index in the array. 
	*/	
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