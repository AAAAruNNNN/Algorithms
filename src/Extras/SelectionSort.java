package Extras;
import java.util.*;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		int pos, elem, temp;
		for (int i = 0; i < n - 1; i++) {
			elem = arr[i];
			pos = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < elem) {
					pos = j;
					elem = arr[j];
				}
			}
			temp = arr[i];
			arr[i] = elem;
			arr[pos] = temp;
		}
		System.out.println("Sorted Array:" + Arrays.toString(arr)); 
	}

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
	    System.out.println("Selection Sort");
		System.out.println("Actual Array:" + Arrays.toString(arr)); 
		selectionSort(arr);
	}
}
	