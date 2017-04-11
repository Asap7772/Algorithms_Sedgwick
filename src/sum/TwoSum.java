package sum;

import java.util.Arrays;

public class TwoSum {
	public static int[][] twoSum(int[] arr){
		
		return null;
	}
	
	public static boolean isASolution(int x, int[] arr){
		Arrays.sort(arr);
		if(Arrays.binarySearch(arr, 0, arr.length-1, -x) >= 0) return true;
		return false;
	}
}
