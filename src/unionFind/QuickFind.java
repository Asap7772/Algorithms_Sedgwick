package unionFind;

import java.util.ArrayList;

public class QuickFind extends UF{
	int arr[];
	ArrayList<Integer> arrL = new ArrayList<Integer>();
	
	QuickFind(int N) {
		super(N);
		arr = new int[N];
		for(int i = 0; i < N ; i++){
			arr[i] = i;
			arrL.add(i);
		}
	}

	@Override
	public void union(int p, int q){
		arrL.remove(arr[q]);
		for(int i = 0; i< arr.length; i++){
			if(arr[i] == arr[q]){
				arr[i] = p;
			}
		}
	}

	@Override
	public void add(){
		int arr2[] = new int[arr.length+1];
		for(int i = 0; i < arr2.length; i++){
			arr2[i] = arr[i];
		}
		arr2[arr2.length] = arr2.length;
	}
	
	@Override
	public boolean connected(int p, int q){
		return (arr[p] == arr[q] ? true:false);
	}

	@Override
	public int find(int p){
		return arr[p];
	}

	@Override
	public int count(){
		return arrL.size();
	}
}
