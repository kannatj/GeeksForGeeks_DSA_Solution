package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Counts {

	int countLeaves(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int leafCount = 0;
		
		while(!q.isEmpty()) {
			
			Node temp = q.remove();
			
			if(temp.left == null  && temp.right == null) {
				leafCount++;
			}
			
			
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		
		return leafCount;
	}
	
	
	int countFull(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int FullCount = 0;
		
		while(!q.isEmpty()) {
			
			Node temp = q.remove();
			
			if(temp.left != null  && temp.right != null) {
				FullCount++;
			}
			
			
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		
		return FullCount;
	}
	
}
