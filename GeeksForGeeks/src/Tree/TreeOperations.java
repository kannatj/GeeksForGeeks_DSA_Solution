package Tree;

import java.util.LinkedList;
import java.util.Queue;
import static java.lang.System.out;

public class TreeOperations {
    
	Node root;
	
	TreeOperations(){
		root = null;
	}
	
	void insert(int value) {
		
		Queue<Node> q = new LinkedList<Node>();
		Node new_node = new Node(value);
		
		if(root == null) {
			root = new_node;
			return;
		}
		else {
			Node temp = root;
			q.add(temp);
			
			while(!q.isEmpty()) {
				
				temp = q.remove();
						
				if(temp.left ==  null) {
					temp.left = new_node;
					break;
				}	
				else if(temp.right == null) {
					temp.right = new_node;
					break;
				}
				else {

					q.add(temp.left);
					q.add(temp.right);
				}
			
			}
		}
		
	}
	
	void delete(int val) {
		Queue<Node> q = new LinkedList<Node>();
		
		if(root == null) return;
		
		q.add(root);
		
		while(!q.isEmpty()){
		  Node temp = q.remove();
		  Node result[];
		  Node deepest;
		  Node previous;
		  
		  if(temp.value == val) {
			  result = findDeepest();
			  previous = result[0];
			  deepest = result[1];
			  System.out.println("Deepest : "+ deepest.value);
			  System.out.println("Previous : "+ previous.value);
			  temp.value = deepest.value;
			  deleteDeepestNode(deepest,previous);
			  return;
		  }
		  
		  if(temp.left != null) {
			  q.add(temp.left);
		  }
		  
		  if(temp.right!=null) {
			  q.add(temp.right);
		  }
		
		}
	}
	
	
	
	private void deleteDeepestNode(Node deepest,Node previous) {
		if(previous.left == deepest) {
			previous.left = null;
		}
		else {
			previous.right = null;
		}
	}
	
	
	
	private Node[] findDeepest() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		Node temp = null;
		Node previous = null;
		Node arr[] = new Node[2];
		
		while(!q.isEmpty())
		{
		    temp = q.remove();
		    
		    if(temp.left != null || temp.right != null)
		        previous = temp;
		    
			if(temp.left != null) 
				q.add(temp.left);
			
			if(temp.right != null) 
				q.add(temp.right);
			
		}
		
		arr[0] = previous;
		arr[1] = temp;
		
		return arr;
	}
	
	
	

	void inorder(Node root) {
		
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.value+" ");
		inorder(root.right);
	}
		
	
	void preorder(Node root) {
			
			if(root == null) {
				return;
			}
		
			System.out.print(root.value+" ");
			preorder(root.left);
			preorder(root.right);
		}
	

	void postorder(Node root) {
		
		if(root == null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.value+" ");
	}
	
	
	void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.remove();
			System.out.print(temp.value+" ");
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			
			if(temp.right!=null) {
				  q.add(temp.right);
			}	
		}
	}
	
	
	void delete() {
		if(root == null) {
		   out.print("Already tree is empty");
		}
		else {
			root = null;
		}
	}
	
	public static void main(String as[]) {
		
		System.out.println("Started");
		
		
		TreeOperations t = new TreeOperations();
		
		t.insert(10);
		t.insert(20);
		t.insert(30);
		t.insert(40);
		t.insert(50);
		t.insert(60);
		t.insert(70);
		
		
		t.inorder(t.root);
		out.println();
		t.preorder(t.root);
		out.println();
		t.postorder(t.root);
		out.println();
		t.levelOrder(t.root);
		
		
        MinMax mm = new MinMax();
        
        int Max = mm.findMax(t.root);
        out.println();
        out.println("Maximum elemet of the tree :"+Max);
        int Min = mm.findMin(t.root);
        out.println();
        out.println("Minimum element of the tree :"+Min);
        
        
        Counts c = new Counts();
        int LeafCount = c.countLeaves(t.root);
        System.out.println();
        System.out.println("Leaf Count :"+LeafCount);
        
        int fullCount = c.countFull(t.root);
        System.out.println();
        System.out.println("FullNode Count :"+fullCount);
        
	}
	
}
