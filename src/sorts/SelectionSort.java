package sorts;

public class SelectionSort {
	public static void main(String[] args){
		printArr(sort(new int[]{6, 8, 3, 9,4, 7,5,2,1}));
	}
	
	/**
	 *<pre>
	 *Selection sort:
	 *=============== 
	 * One of the simplest sorting algorithms works as follows: 
	 *	- First, find the smallest item in the array, and exchange it with the first entry. 
	 *	- Then, find the next smallest item and exchange it with the second entry.
	 *	- Continue in this way until the entire array is sorted. 
	 *	- This method is called selection sort because it works by repeatedly selecting the smallest remaining item.
	 *  <pre>
	 * @param arr takes in an array to sort
	 * @return returns sorted array
	 */
	public static int[] sort(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			int leastN = i; // remember the following
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[leastN]){
					 leastN = j;
				}
			}
			int x = arr[i];
			arr[i] = arr[leastN];
			arr[leastN] = x;
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
