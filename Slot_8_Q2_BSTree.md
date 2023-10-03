```cpp
class Node {
    int info;
    Node left,right;

    Node(int x, Node p, Node q){
        info=x;left=p; right=q;
    }  
    Node(int x){
        this(x,null,null);
    }  
 }


class BSTree {
    Node root;

    BSTree() {
        root = null;
    }

    Node insertRec(Node root, int x) {
    //.........
    }
    // Insertion
    void insert(int x) {
    //.........
    }

    // In-order traversal
    void inOrder(Node p) {
    // ......
    }

    // Pre-order traversal
    void preOrder(Node p) {
    // .....
    }

    // Post-order traversal
    void postOrder(Node p) {
    // ......
    }
    
    Node searchRec(Node root, int x) {
    // ....
    }
    
    // Search for a node with key x
    Node search(int x) {
    // ....
    }

    int minValue(Node root) {
    // .....
    }
    
    Node deleteRec(Node root, int x) {
    // ....
    }
    
    // Delete a node by merging
    void deleteByMerging(int x) {
    // ....
    }
    
    Node deleteRecCopy(Node root, int x) {
    // ......
    }
    // Delete a node by copying
    void deleteByCopying(int x) {
    // ....
    }


    void visit(Node p) {
        System.out.print(p.info + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        BSTree tree = new BSTree();

        // Insert elements into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // In-order traversal
        System.out.println("In-order traversal:");
        tree.inOrder(tree.root);

        // Pre-order traversal
        System.out.println("\nPre-order traversal:");
        tree.preOrder(tree.root);

        // Post-order traversal
        System.out.println("\nPost-order traversal:");
        tree.postOrder(tree.root);

        // Search for an element
        int searchKey = 30;
        Node searchResult = tree.search(searchKey);
        if (searchResult != null) {
            System.out.println("\nFound " + searchKey + " in the tree.");
        } else {
            System.out.println("\n" + searchKey + " not found in the tree.");
        }

        // Delete an element by merging
        int deleteKeyMerging = 30;
        System.out.println("\nDeleting " + deleteKeyMerging + " by merging:");
        tree.deleteByMerging(deleteKeyMerging);
        tree.inOrder(tree.root);

        // Delete an element by copying
        int deleteKeyCopying = 50;
        System.out.println("\nDeleting " + deleteKeyCopying + " by copying:");
        tree.deleteByCopying(deleteKeyCopying);
        tree.inOrder(tree.root);
    }
}

```
