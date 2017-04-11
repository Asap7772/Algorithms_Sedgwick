package sorts;

import java.util.Scanner;

public class Shuffle {
	public static void main(String[] args){
		//printArr(sort(new int[]{1,2,3,4,5,6,7,8,9,10}));
		System.out.print("Enter number of items to shuffle: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr = new int[num];
		for(int i = 1; i <= num; i++){
			arr[i-1] = i;
		}
		printArr(sort(arr));
		scanner.close();
	}
	
	/**
	 *<pre>
	 *  Shuffle:
	 *  ========
	 * 	shuffle an array in random order
	 *<pre>
	 * @param arr takes in an array to sort
	 * @return returns sorted array
	 */
	public static int[] sort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int x = (int)(Math.random() * arr.length);
			int t = arr[i];
			arr[i] = arr[x];
			arr[x] = t;
		}
		return arr;
	}
	
	public static void printArr(int[] arr){
		System.out.print("[ " + arr[0]);
		for(int i = 1; i < arr.length; i++){
			System.out.print(" , "+ arr[i]);
		}
		System.out.print("]");
	}
}
