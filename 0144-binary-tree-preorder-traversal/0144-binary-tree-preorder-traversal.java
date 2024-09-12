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
    // public void preorder(TreeNode root, List<Integer> ll){
    //     if(root == null){
    //         return;
    //     } else {
    //         ll.add(root.val);
    //         preorder(root.left,ll);
    //         preorder(root.right,ll);
    //     }
    // }

    public void preorder(TreeNode root, List<Integer> lt){
        if(root == null)
            return;
        else {
            lt.add(root.val);
            preorder(root.left, lt);
            preorder(root.right, lt);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        // List<Integer> ll = new ArrayList<Integer>();
        // preorder(root,ll);
        // return ll;

        List<Integer> lt = new ArrayList<>();
        preorder(root, lt);
        return lt;
    }
}