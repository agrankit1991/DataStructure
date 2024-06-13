package org.bawandar.datastructure.tree.traversal;

import org.bawandar.datastructure.tree.TreeNode;

public class PostOrderTraversal implements TreeTraversal {

    @Override
    public void traverse(final TreeNode root) {
        if (root != null) {
            traverse(root.left);
            traverse(root.right);
            System.out.printf("%s ", root.data);
        }
    }
}
