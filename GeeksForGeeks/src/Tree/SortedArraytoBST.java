package Tree;

import java.util.Arrays;

public class SortedArraytoBST {
	
	
	static Node minTree(int arr[],int start,int end) {
		
		if(start>end) {
			return null;
		}
		
		int mid = (start+end)/2;
		Node n = new Node(arr[mid]);
		
		n.left = minTree(arr,start,mid-1);
		n.right = minTree(arr,mid+1,end);
		
		return n;
	}
	
	
	public static void main(String as[]) {
		int arr[] = {1,2,3,4,7,6,5};
		
		Arrays.sort(arr);
		
		TreeOperations t  = new TreeOperations();
		
        Node root = minTree(arr,0,arr.length-1);
        
        t.levelOrder(root);
        
        System.out.println("Inorder");        
        t.inorder(root);
        
 
	}

}
