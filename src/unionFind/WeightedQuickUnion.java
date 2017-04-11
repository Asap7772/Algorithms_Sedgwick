package unionFind;

public class WeightedQuickUnion extends UF{
	int[] parent; //parent of the root
	int[] size; //number of nodes in the subtree
	int count; //total number of nodes
	
	WeightedQuickUnion(int N) {
		super(N);
		parent = new int[N];
		size = new int[N];
		count = N;
		for(int i = 0; i < N; i++){
			parent[i] = i;
			size[i] = 1;
		}
	}
	
	@Override
	public void union(int p, int q){
		int rootp = find(p);
		int rootq = find(q);
		if(!connected(p,q)){
			if(size[rootp] >= size[rootq]){
				parent[rootq] = rootp;
				size[rootp] += rootq;
			}else{
				parent[rootp] = rootq;
				size[rootq] += rootp;
			}
		}
	}

	@Override
	public boolean connected(int p, int q){
		return (find(p) == find(q));
	}

	@Override
	public int find(int p){
		while(parent[p] != p){
			p = parent[p];
		}
		return p;
	}

	public int count(){
		return 0;
	}
}
