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
    // Global vars
    int count = 0;
    int answer = 0;

    public int kthSmallest(TreeNode root, int k) {
        // Base case
        if(root == null){
            return 0;
        }

        // Since this is inorder,
        // looks at the left nodes first
        kthSmallest(root.left, k);

        // Increments count with every node we find,
        // smallest to largest
        count++;
        // Since we're going in order,
        // once it hits kth index,
        // that's the answer
        if(count == k){
            answer = root.val;
            return answer;
        }

        // Recurses through the right node
        kthSmallest(root.right, k);
        
        return answer;
    }
}
