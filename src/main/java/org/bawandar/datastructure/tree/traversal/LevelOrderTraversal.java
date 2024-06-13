package org.bawandar.datastructure.tree.traversal;

import org.bawandar.datastructure.queue.Queue;
import org.bawandar.datastructure.queue.SimpleQueue;
import org.bawandar.datastructure.tree.TreeNode;


public class LevelOrderTraversal implements TreeTraversal {

    private final Queue<TreeNode> queue;

    public LevelOrderTraversal() {
        queue = new SimpleQueue<>();
    }

    @Override
    public void traverse(final TreeNode root) {
        if (root == null) {
            return;
        }
        queue.enqueue(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.dequeue();
            System.out.printf("%s ", node.data);
            if (node.left != null) {
                queue.enqueue(node.left);
            }
            if (node.right != null) {
                queue.enqueue(node.right);
            }
        }
    }
}
