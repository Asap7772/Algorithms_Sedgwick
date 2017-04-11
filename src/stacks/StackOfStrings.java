package stacks;

public class StackOfStrings{
	Node head;
	int size;
	
	public StackOfStrings(){
		head = null;
	}
	
	public void push(String item){
		Node n = new Node();
		n.next = head;
		head = n;
		size ++;
	}
	
	public String pop(){
		if(head != null){
			Node n = head;
			head = head.next;
			size --;
			return n.item;
		}else{
			return null;
		}
	}
	
	public boolean isEmpty(){
		if (head == null) return true;
		return false;
	}
	private class Node{
		String item;
		Node next;
	}
}
