/*
A binary tree is uni-valued if every node in the tree has the same value.
Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        List<Integer> values = new ArrayList();     //store all tree node values here
        dfs(root, values);                          //perform dfs on root and store the values in values
        for (int value: values)                     //iterate values
            if (value != values.get(0))             //check if any given value matches our root value
                return false;                       //if it doesnt, the tree isnt uni-valued
        return true;                                //if it passed all checks, the tree is uni-valued
    }
    
    
    public void dfs(TreeNode root, List<Integer> values) {
        if (node!=null) {                           //keep recursively look for values until we hit the end
            values.add(root.val);                   //add values into values
            dfs(root.left, values);                 //check the left path
            dfs(root.right, values);                //and the right path
        }
    }
}
