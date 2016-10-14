import java.util.LinkedList;
import java.util.Queue;

/*
 * as it is pre order travel first element is the root
 * now we travel array till we get a value greater than first value
 * since all the values greater than root will be to right of tree
 * so now i found the index where the greater values started and divided the array into two
 * and added the left part to left side of root and right part to right side of root
 * and those parts called recursion again.
 */
public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {10,5,1,7,40,35,80,100};
		
		TreeNode root = BST(a);
		printTreeLevel(root);
		System.out.println(checkBalance(root));
		
	}
	
	public static TreeNode BST(int [] arr)
	{
		if(arr.length==0)				
			return null;
		
		
		TreeNode root = new TreeNode(arr[0]);
		
		int i =0;
		for(i =0;i<arr.length;i++)				//check which node value exceeds root value and break
		{										//array into left and right parts
			if(arr[i]>root.item) break;
		
		}
		int [] arrLeft = new int [i-1];			//left and right arrays intialisation
		int [] arrRight = new int [arr.length-i];
		
		for(int j =0;j<arrLeft.length;j++)			//filling arrays with respective values
		{
			arrLeft[j] = arr[j+1];
			
		}
		for(int k =0;k<arrRight.length;k++)
		{
			arrRight[k] = arr[k+i];
		}
		root.leftChild = BST(arrLeft);				//by recursion add the left array elements
		root.rightChild = BST(arrRight);			//to left of root and right array to right of root
		return root;
		
	}
	
	//-------------------------------------------------------------------------------------//
	/*
	 * I used queue data structure as explained in class

	 * I tried to add root to the list and then popped and printed it 
	 * at the same time check if it has children and if it has then push them to list
	 * now keep track of the size of list such that we will print out the same level in the same line
	 * this is done by using count variable which is initialised to queue size and keep popping until
	 * there are no elements
	 */


		public static void printTreeLevel(TreeNode root)
		{
			Queue<TreeNode> q = new LinkedList<TreeNode>();			//create queue
			
			q.offer(root);											//first offer root
			int count;
			
			while(!q.isEmpty())										//run the loop until there are no elements
			{
				count = q.size();
				while(count>0)
				{
					TreeNode cur = q.poll();						//use temp node to print it and track
					System.out.print(" "+cur.item);					//children 
					
					
					if(cur.leftChild!=null)							//no left child then dont add anything
					{
						q.offer(cur.leftChild);
						
					}
						
					if(cur.rightChild!=null)						//if no right child then dont add
					{
						q.offer(cur.rightChild);
						
					}
					count--;										//this says that we popped one element
				}
				
				
					System.out.println();
				
				
			}
		}
	//-----------------------------------------------------------------------------------//

/*
 * to check if a tree is balanced or not we have to check the
 * difference between left subtree and right subtree is less than 2
 * and also the left and right subtrees should be balanced
 * 
 * so we use getHeight method to get the height of trees and use that height to know
 * if the tree is balanced or not
 * 
 * and similarly by recursion we find if sub trees are balanced or not
 * 
 * 
 * and for getHeight method we find height by recursion
 * the logic here is to get the height of tree we find the max of heights between
 * left and right subtree and add one to it..
 */
	public static boolean checkBalance(TreeNode root)
	{
		if(root==null) return true;				//if the node is not there return true
		
		
		if(-1<=getHeight(root.leftChild)-getHeight(root.rightChild)		//if the difference of height of
				&& getHeight(root.leftChild)-getHeight(root.rightChild) <=1)//subtrees is less than 2
		{														
			if(checkBalance(root.leftChild) && checkBalance(root.rightChild)==true)
			return true;				//then check if both subtrees are balanced or not by recursion
		}								//if they are then return true

		return false;					//if all those cases fail return false
	}

	public static int getHeight(TreeNode node)
	{
		    if (node == null)
		    {
		        return 0;
		    }
		    else
		    {							//if the node has left or right child then get subtrees height 
		        return 1 +	Math.max(getHeight(node.leftChild),
		        		getHeight(node.rightChild));			//first and add one to get the trees height  
		    }
	}
}



