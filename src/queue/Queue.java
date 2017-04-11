package queue;

public class Queue {
	int size;
	Node first;
	Node last;
	
	public Queue() {
		size = 0;
		first = null;
		last = null;
	}
	
	public void enqueue(Node n){
		if(first == null){
			first = n;
			last = n;
		}
		last.next = n;
	}
	
	public void enqueue(int x){
		Node n = new Node();
		n.item = x;
		if(first == null){
			first = n;
			last = n;
		}
		last.next = n;
		last = last.next;
	}
	
	public Node dequeue(){
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	private class Node{
		int item;
		Node next;
	}
	
	
	public static void main(String[] args){
		Queue x = new Queue();
		for(int i = 0; i < 10; i++){
			x.enqueue(i);
		}
		for(int i = 0; i < 10; i++){
			System.out.println(x.dequeue().item);
		}
	}
}
