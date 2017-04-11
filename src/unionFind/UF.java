package unionFind;

public abstract class UF {
	UF(int N) {
		/**
		 *  TODO initialize union find data with N objects(0 to N-1)
		 */
	}

	public void union(int p, int q){
		/**
		 *  TODO add connection between P and Q
		 */
	}

	public boolean connected(int p, int q){
		/**
		 * TODO are P and Q in the same component?
		 */
		return false;
	}

	public int find(int p){
		/**
		 * TODO component identifier for p(0 to N-1)
		 */
		return 0;
	}

	public int count(){
		/**
		 * TODO number of components
		 */
		return 0;
	}
	
	public void add(){
		/**
		 * TODO just for fun
		 */
	}
}