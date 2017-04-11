package heaps;

import java.util.Arrays;

public class BinaryMaxHeap{
	int[] arr;
	int size = 0;
	
	public BinaryMaxHeap(int size) {
		arr = new int[size];
	}

	public int getMax() throws NullPointerException{
		if(size == 0) throw new NullPointerException("There are no elements in the Heap");
		int max = arr[0];
		exchange(0,(size--)-1); // both exchanges elements and reduces the number of elements
		sink(0);
		return max;
	}
	
	public void exchange(int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	public void sink(int x) {
		if(size <= x*2 + 1) throw new NullPointerException("This element does not exist");
		while(arr[x] > arr[x*2] || arr[x] > arr[x*2 + 1]){
			if(arr[x] > arr[x*2] && arr[x] > arr[x*2 + 1]){
				int greater = arr[2*x] > arr[2*x +1]? 2*x: 2*x+1;
				exchange(x, greater);
				x = greater;
			}else if(arr[x] > arr[x*2]){
				exchange(x, x*2);
				x = x*2;
			}else{
				exchange(x, x*2+1);
				x = x*2+1;
			}
		}
	}

	public void swim(int x) {
		if(size <= x) throw new NullPointerException("This element does not exist");
		while(arr[x] < arr[x/2]){
			exchange(x,x/2);
			x = x/2;
		}
	}
	
	public void resizeArr(){
		Arrays.copyOf(arr, (int)((arr.length+1)*1.6));
	}

	public void insert(int x) {
		if(arr.length > size) resizeArr();
		arr[++size] = x;
		swim(size);
	}

	public static void main(String[] args) {
		BinaryMaxHeap heap = new BinaryMaxHeap(10);
		for(int i = 0; i< 10; i++) heap.insert(i);
		System.out.println(heap.getMax());
	}

}
