package org.bawandar.datastructure.tree.traversal;

import org.bawandar.datastructure.tree.TreeNode;

public class PreOrderTraversal implements TreeTraversal {

    @Override
    public void traverse(final TreeNode root) {
        if (root != null) {
            System.out.printf("%s ", root.data);
            traverse(root.left);
            traverse(root.right);
        }
    }
}
