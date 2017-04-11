
public class binarySearch {
	int height(Node root)
    {
         if(root.left != null){
             if(root.right != null){
                 return (1 +  height(root.right) > height(root.left) ? height(root.right) : height(root.left));
             }else{
                 return (1 + height(root.left));
             }
         }else{
             if(root.right != null){
                 return (1 + height(root.right));
             }else{
                 return 1;
             }
         }
    }
	
	private class Node{
		int data;
		Node right;
		Node left;
	}
	
	public static void main(String[] args){
		
	}
}
