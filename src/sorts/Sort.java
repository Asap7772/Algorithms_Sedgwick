package sorts;

public class Sort {
	public static void main(String[] args){
		printArr(sort(new int[]{6, 8, 3, 9,4, 7,5,2,1}));
	}

	/**
	 * My sort
	 * =======
	 * I do not know what sort this is
	 * @param arr unsorted array of ints
	 * @return sorted array of ints
	 */
	public static int[] sort(int[] arr){
		int x;
		for(int j = 0; j < arr.length; j++)
			for(int i = j+1; i < arr.length; i++){
				if(arr[j] > arr[i]){
					x = arr[i];
					arr[i] = arr[j];
					arr[j] = x;
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
