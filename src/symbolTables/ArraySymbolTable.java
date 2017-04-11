package symbolTables;

public class ArraySymbolTable extends SymbolTable{
	int[] arr;
	
	public ArraySymbolTable(){
		super();
		arr = new int[10];
	}
	
	public ArraySymbolTable(int size){
		super();
		arr = new int[size];
	}
	
	private void resizeArr(){
			
	}
	
	@Override
	public void put(int key, int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int get(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(int key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Integer> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
