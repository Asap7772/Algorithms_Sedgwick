package sorts;

public class List {
	/*
	  Merge two linked lists 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/

	Node MergeLists(Node headA, Node headB) {
	    Node head = null;
	    Node curr = new Node();
	    int count = 0;
	    while(headA!= null && headB != null){
	        if(headA.data > headB.data){
	            if(count == 0){
	                head = new Node();
	                head.data = headA.data;
	                headA = headA.next;
	                curr = head;
	                ++count;
	            }else{
	                curr.next = new Node();
	                curr.next.data = headA.data;
	                headA = headA.next;
	                curr = curr.next;
	            }
	        }else{
	            if(count == 0){
	                head = new Node();
	                head.data = headB.data;
	                headB = headB.next;
	                curr = head;
	                ++count;
	            }else{
	                curr.next = new Node();
	                curr.next.data = headB.data;
	                headB = headB.next;
	                curr = curr.next;
	            }
	        }
	    }
	    
	    if(headA != null){
	        curr.next = headA;
	    }
	    if(headB != null){
	        curr.next = headB;
	    }
	    return head;
	}
	
	private class Node{
		int data;
	     Node next;
	}
}


