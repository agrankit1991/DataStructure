package org.bawandar.datastructure.tree.traversal;

import org.bawandar.TestData;
import org.bawandar.datastructure.tree.TreeNode;

import static org.bawandar.datastructure.Constants.LINE_BREAK;

public class Main {
    public static void main(final String[] args) {
        final TreeNode rootNode = new TestData().createBinaryTree();

        System.out.println("In Order Traversal");
        final TreeTraversal inOrderTraversal = new InOrderTraversal();
        inOrderTraversal.traverse(rootNode);

        // Added to separate the output of different traversals
        System.out.println(LINE_BREAK);

        System.out.println("Pre Order Traversal");
        final TreeTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.traverse(rootNode);

        // Added to separate the output of different traversals
        System.out.println(LINE_BREAK);

        System.out.println("Post Order Traversal");
        final TreeTraversal postOrderTraversal = new PostOrderTraversal();
        postOrderTraversal.traverse(rootNode);

        // Added to separate the output of different traversals
        System.out.println(LINE_BREAK);

        System.out.println("Level Order Traversal");
        final TreeTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.traverse(rootNode);

    }
}
