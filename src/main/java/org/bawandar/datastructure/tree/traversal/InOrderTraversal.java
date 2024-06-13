package org.bawandar.datastructure.tree.traversal;

import org.bawandar.datastructure.tree.TreeNode;

public class InOrderTraversal implements TreeTraversal {

    @Override
    public void traverse(final TreeNode root) {
        if (root != null) {
            traverse(root.left);
            System.out.printf("%s ", root.data);
            traverse(root.right);
        }
    }
}
