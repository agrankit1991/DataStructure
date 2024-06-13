package org.bawandar;

import org.bawandar.datastructure.tree.TreeNode;

public class TestData {

    // Tree diagram for createBinaryTree() method
    //          40
    //         /  \
    //       20    60
    //      / \    / \
    //     10 30  50 70
    //
    // Pre-order traversal: 40 20 10 30 60 50 70
    // In-order traversal: 10 20 30 40 50 60 70
    // Post-order traversal: 10 30 20 50 70 60 40
    // Level-order traversal: 40 20 60 10 30 50 70
    public static TreeNode createBinaryTree() {
        final TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        rootNode.left = node20;
        rootNode.right = node60;

        node20.left = node10;
        node20.right = node30;

        node60.left = node50;
        node60.right = node70;

        return rootNode;
    }

}
