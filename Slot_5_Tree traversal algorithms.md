# Tree traversal algorithms

0. Implementing Binary Trees
1. Preorder traversal
2. Inorder traversal
3. Postorder traversal
4. Level-order traversal 

```cpp
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    // Insert a node into the binary tree
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }

    // Preorder traversal
    public void preorderTraversal() {
        preorderTraversalRecursive(root);
    }

    private void preorderTraversalRecursive(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderTraversalRecursive(root.left);
            preorderTraversalRecursive(root.right);
        }
    }

    // Inorder traversal
    public void inorderTraversal() {
        inorderTraversalRecursive(root);
    }

    private void inorderTraversalRecursive(TreeNode root) {
        if (root != null) {
            inorderTraversalRecursive(root.left);
            System.out.print(root.data + " ");
            inorderTraversalRecursive(root.right);
        }
    }

    // Postorder traversal
    public void postorderTraversal() {
        postorderTraversalRecursive(root);
    }

    private void postorderTraversalRecursive(TreeNode root) {
        if (root != null) {
            postorderTraversalRecursive(root.left);
            postorderTraversalRecursive(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Level-order traversal (Breadth-First Search)
    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Preorder Traversal:");
        tree.preorderTraversal();

        System.out.println("\nInorder Traversal:");
        tree.inorderTraversal();

        System.out.println("\nPostorder Traversal:");
        tree.postorderTraversal();

        System.out.println("\nLevel-order Traversal:");
        tree.levelOrderTraversal();
    }
}
```
