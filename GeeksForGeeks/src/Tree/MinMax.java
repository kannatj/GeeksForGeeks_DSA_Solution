package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinMax {

	
	static int Max = Integer.MIN_VALUE;
	static int Min = Integer.MAX_VALUE;
	
	int findMax(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
			
		while(!q.isEmpty()) {
		     Node temp = q.remove();
		     
		     if(temp.value > Max) {
		    	Max = temp.value; 
		     }
		     
		     if(temp.left != null)
		    	 q.add(temp.left);
		     if(temp.right !=null)
		    	 q.add(temp.right);
		}
		
		
		return Max;
	}
	
	
	
	int findMin(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
			
		while(!q.isEmpty()) {
		     Node temp = q.remove();
		     
		     if(temp.value < Min) {
		    	Min = temp.value; 
		     }
		     
		     if(temp.left != null)
		    	 q.add(temp.left);
		     if(temp.right !=null)
		    	 q.add(temp.right);
		}
		
		
		return Min;
	}
	
}
