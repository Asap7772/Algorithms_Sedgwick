package sorts;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args){
		int[] arr = new int[]{5, 6, 7, 8, 9, 0, 1, 2, 3, 4};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 *<pre>
	 *  Merge Sort:
	 *  =============== 
	 *  In computer science, merge sort (also commonly spelled mergesort)
	 *  is an efficient, general-purpose, comparison-based sorting algorithm.
	 *  Most implementations produce a stable sort, which means that the implementation 
	 *  preserves the input order of equal elements in the sorted output.
	 *<pre>
	 * @param arr takes in an array to sort
	 * @return returns sorted array
	 */

	public static void sort(int[] arr){
		int[] aux = new int[arr.length];
		sort(arr, aux, 0, arr.length-1);
	}
	
	public static void sort(int[] arr, int[] aux, int lo, int hi){
		if(hi<= lo) return;
		int mid = lo + ((hi-lo)/2);
		sort(arr, aux, lo, mid);
		sort(arr, aux, mid +1, hi);
		merge(arr, aux, lo, mid, hi);
	}
	
	public static void merge(int[] arr, int[] aux, int lo, int mid, int hi){
		for(int i = lo; i<= hi; i++){
			aux[i] = arr[i];
		}
		int leftHalf = lo;
		int rightHalf = mid + 1; // middle
		for(int i = lo; i <= hi; i++){
			if(rightHalf > hi){
				arr[i] = aux[leftHalf];
				leftHalf++;
			}
			else if(leftHalf > mid){
				arr[i] = aux[rightHalf];
				rightHalf++;
			}
			else if(aux[leftHalf] > aux[rightHalf]){
				arr[i] = aux[rightHalf];
				rightHalf++;
			}else{
				arr[i] = aux[leftHalf];
				leftHalf++;
			}
		}
	}
	
/*	public static void copy(int arr[], int aux[], int lo, int hi){
		for(int i = lo; i<= hi; i++){
			aux[i] = arr[i];
		}
	}*/
}
