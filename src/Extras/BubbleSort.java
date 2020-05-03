package Extras;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
    	boolean isSortingDone;
    	int n = arr.length;
    	int smallest = arr[0];

    	for(int i = 0; i < n - 1 ; i++)
    	{
    		isSortingDone = true;
    		for(int j = 0; j < n - i - 1; j++)
    		{
    			if(arr[j] > arr[j+1])
    			{
    				smallest = arr[j+1];
    				arr[j+1] = arr[j];
    				arr[j] = smallest;
    				isSortingDone = false;
    			}
    		}
    		System.out.println("Iteration:" + i + Arrays.toString(arr)); 
			if(isSortingDone)
				break;
    	}
    		
		System.out.println("Sorted Array:" + Arrays.toString(arr)); 
    }

	public static void main(String args[]) {
	    int[] arr = {5,1,4,2,8,9};
	    System.out.println("Bubble Sort");
		System.out.println("Actual Array:" + Arrays.toString(arr)); 
	    bubbleSort(arr);
	}

}

