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
class Q_2{
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        getNode(root,list);

        return list.get(k-1);

    }

    public void getNode(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }

        getNode(node.left,list);
        list.add(node.val);
        getNode(node.right,list);

    }
}