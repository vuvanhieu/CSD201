// Updated deleteByCopying method
    void deleteByCopying(int xPrice) throws Exception {
        clear();
        loadData(1);
        root = deleteByCopyingRec(root, xPrice);

        // Write the updated tree to a text file
        String fname = "deleteByCopying_result.txt";
        File resultFile = new File(fname);
        if (resultFile.exists()) {
            resultFile.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        inOrder(root, f);
        f.close();
    }
    
    private Node deleteByCopyingRec(Node root, int xPrice) {
        if (root == null) {
            return root;
        }

        if (xPrice < root.info.price) {
            root.left = deleteByCopyingRec(root.left, xPrice);
        } else if (xPrice > root.info.price) {
            root.right = deleteByCopyingRec(root.right, xPrice);
        } else {
            // Node to delete is found

            // Case 1: Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 2: Node with two children
            // Find the in-order successor (minimum in the right subtree)
            Node successor = findMin(root.right);

            // Copy the successor's data to this node
            root.info = successor.info;

            // Delete the successor
            root.right = deleteByCopyingRec(root.right, successor.info.price);
        }
        return root;
    }
