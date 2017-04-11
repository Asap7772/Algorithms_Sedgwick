package sorts;

public class ShellSort {
	public static void main(String[] args){
		printArr(sort(new int[]{6, 8, 3, 9,4, 7,5,2,1}));
	}
	
	/**
	 *<pre>
	 *  ShellSort:
	 *  ========== 
	 *  The algorithm that people often use to sort bridge hands is to consider the cards one at a time, 
	 *  inserting each into its proper place among those already considered (keeping them sorted).
	 *  In a computer implementation, we need to make space for the current item by moving larger items
	 *  one position to the right, before inserting the current item into the vacated position. 
	 *  Insertion.java is an implementation of this method, which is called insertion sort.
	 *<pre>
	 * @param arr takes in an array to sort
	 * @return returns sorted array
	 */
	public static int[] sort(int[] arr){
		
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
