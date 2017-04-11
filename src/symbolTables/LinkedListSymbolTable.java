package symbolTables;

public class LinkedListSymbolTable extends SymbolTable{
	Node root;
	int size;
	
	public LinkedListSymbolTable(){
		root = null;
		size = 0;
	}
	
	@Override
	public void put(int key, int value){
		Node temp = root;
		root = new Node(key, value);
		root.next = temp;
	}
	
	@Override
	public int get(int key){
		Node x = root;
		while(x != null){
			if(x.key == key) return x.value;
			x = x.next;
		}
		return -1;
	}
	
	@Override
	public boolean contains(int key){
		return get(key) != -1;
	}
	
	@Override
	public void delete(int key){
		Node x = root;
		if(x == null){
			return;
		}
		Node prev = null;
		while(x.key != key){
			if(x.next == null) return;
			prev = x;
			x = x.next;
		}
		prev.next = x.next;
	}
	
	@Override
	public boolean isEmpty(){
		return size>0;
	}
	
	@Override
	public int getSize(){
		return size;
	}
	
	// TODO Finish this method
	@Override
	public Iterable<Integer> keys(){
		return null;
	}
	
	private class Node {
		Node next;
		int key;
		int value;
		
		public Node(int key, int value){
			this.key = key;
			this.value = value;
		}
	}
}
