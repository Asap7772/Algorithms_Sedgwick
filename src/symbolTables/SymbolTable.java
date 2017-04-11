package symbolTables;

public abstract class SymbolTable {
	public int size;
	
	public abstract void put(int key, int value);
	public abstract void delete(int key);
	public abstract int get(int key);
	public abstract boolean contains(int key);
	public abstract boolean isEmpty();
	public abstract Iterable<Integer> keys();
	public abstract int getSize();
}
