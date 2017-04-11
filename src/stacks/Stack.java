package stacks;

public class Stack{
	Node head;
	int size;
	
	public Stack(){
		head = null;
	}
	
	public void push(Object item){
		Node n = new Node();
		n.next = head;
		head = n;
		size ++;
	}
	
	public Object pop(){
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
		return (head == null);
	}
	
	private class Node{
		Object item;
		Node next;
	}
}