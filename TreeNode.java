
public class TreeNode{
  public int item;
  public TreeNode leftChild;
  public TreeNode rightChild;

  public TreeNode(int newItem) {
  // Initializes tree node with item and no children (a leaf).
    item = newItem;
    leftChild  = null;
    rightChild = null;
  }  // end constructor    
  public TreeNode(int newItem, 
                  TreeNode left, TreeNode right) {
  // Initializes tree node with item and
  // the left and right children references.
    item = newItem;
    leftChild  = left;
    rightChild = right;
  }  // end constructor
  public int getItem() {
  // Returns the item field.
    return item;
 }  // end getItem
}