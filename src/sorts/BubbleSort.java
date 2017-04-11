package sorts;

public class BubbleSort {
	public static void main(String[] args){
		printArr(sort(new int[]{6, 8, 3, 9,4, 7,5,2,1}));
	}
	
	/**
	 *<pre>
	 *  Bubble Sort:
	 *  =============== 
	 *  Bubble sort, sometimes referred to as sinking sort, 
	 *  is a simple sorting algorithm that repeatedly steps through the list to be sorted, 
	 *  compares each pair of adjacent items and swaps them if they are in the wrong order. 
	 *  The pass through the list is repeated until no swaps are needed,
	 *  which indicates that the list is sorted. The algorithm, which is a comparison sort,
	 *  is named for the way smaller elements "bubble" to the top of the list. 
	 *  Although the algorithm is simple, it is too slow and impractical for most problems even when compared to insertion sort.
	 *  It can be practical if the input is usually in sorted order but may occasionally have some out-of-order elements nearly in position.
	 *<pre>
	 * @param arr takes in an array to sort
	 * @return returns sorted array
	 */
	public static int[] sort(int[] arr){
		int c = -1;
		int x;
		while(c != 0){
			c = 0;
			for(int i = 0; i < arr.length-1; i++){
				if(arr[i] > arr[i+1]){
					x = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = x;
					c++;
				}
			}
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
