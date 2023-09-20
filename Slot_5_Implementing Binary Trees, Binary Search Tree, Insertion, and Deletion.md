1. Implementing Binary Trees
2. Binary Search Tree
3. Insertion
4. Deletion


```cpp
1. Implementing Binary Trees in Java:
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

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }
}

2. Binary Search Tree (BST) in Java:

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Other BST-related methods can be added here.
}

3. Insertion in a Binary Search Tree (BST) in Java:
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


4. Deletion in a Binary Search Tree (BST) in Java:
public void delete(int data) {
    root = deleteRecursive(root, data);
}

private TreeNode deleteRecursive(TreeNode root, int data) {
    if (root == null) {
        return root;
    }

    if (data < root.data) {
        root.left = deleteRecursive(root.left, data);
    } else if (data > root.data) {
        root.right = deleteRecursive(root.right, data);
    } else {
        // Node with one child or no child
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }

        // Node with two children
        root.data = minValue(root.right);

        root.right = deleteRecursive(root.right, root.data);
    }

    return root;
}

private int minValue(TreeNode root) {
    int minValue = root.data;
    while (root.left != null) {
        minValue = root.left.data;
        root = root.left;
    }
    return minValue;
}


```

