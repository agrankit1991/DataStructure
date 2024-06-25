# DataStructure

This project is a collection of various data structures implemented in Java. It uses Gradle as a build tool. The data structures included in this project are:

## Queue
A simple queue implementation is provided in the `org.bawandar.datastructure.queue` package. The `SimpleQueue` class implements the `Queue` interface using a `LinkedList`. The queue supports the following operations:

- `enqueue(T data)`: Adds an element to the end of the queue.
- `dequeue()`: Removes an element from the front of the queue and returns it.
- `peek()`: Returns the element at the front of the queue without removing it.
- `isEmpty()`: Checks if the queue is empty.
- `size()`: Returns the number of elements in the queue.

You can run a simple demonstration of the queue operations by running the `main` method in the `SimpleQueue` class.

## Binary Tree
A binary tree is provided in the `org.bawandar` package. The `TestData` class contains a method `createBinaryTree()` that creates a binary tree with the following structure:

          40
         /  \
       20    60
      / \    / \
     10 30  50 70

The tree nodes are instances of the `TreeNode` class, which has `left` and `right` fields for the child nodes. The tree can be traversed in pre-order, in-order, post-order, and level-order.

## Running the Project
You can run the project using Gradle.

## Future Work
This project is a work in progress. More data structures and operations will be added in the future.