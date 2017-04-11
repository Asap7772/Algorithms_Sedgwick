package sorts;

public class InsertionSort {
	public static void main(String[] args){
		printArr(sort(new int[]{6, 8, 3, 9,4, 7,5,2,1}));
	}
	
	/**
	 *<pre>
	 *  Insertion Sort:
	 *  =============== 
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
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i+1; j < arr.length; j++){
				int x = j;
				while(x>0){
					if(arr[x] < arr[x-1]){
						int y = arr[x];
						arr[x] = arr[x-1];
						arr[x-1] = y;
						x--;
					}else break;
					printArr(arr);
					System.out.println();
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
