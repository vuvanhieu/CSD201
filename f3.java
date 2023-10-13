void f3() throws Exception
    {clear();
     loadData(7);
     String fname = "f3.txt";
     File g123 = new File(fname);
     if(g123.exists()) g123.delete();
     RandomAccessFile  f = new RandomAccessFile(fname, "rw"); 
     breadth(root,f);
     f.writeBytes("\r\n");
    //------------------------------------------------------------------------------------
     /*You must keep statements pre-given in this function.
       Your task is to insert statements here, just after this comment,
       to complete the question in the exam paper.*/
     
    // Find and delete the first node with both children and price < 7
    Node parent = null;
    Node nodeToDelete = null;
    Node p = root;
    Queue q = new Queue();
    
    while (p != null) {
        if (p.left != null && p.right != null && p.info.price < 7) {
            nodeToDelete = p;
            break;
        }
        parent = p;
        if (p.left != null) {
            q.enqueue(p.left);
        }
        if (p.right != null) {
            q.enqueue(p.right);
        }
        p = (Node) q.dequeue();
    }

    if (nodeToDelete != null) {
        // Copy the data from the last node in the 
        // tree to the node to delete
        Node lastNode = p;
        Node lastNodeParent = parent;
        while (lastNode.right != null) {
            lastNodeParent = lastNode;
            lastNode = lastNode.right;
        }
        nodeToDelete.info = lastNode.info;

        // Delete the last node
        if (lastNodeParent == null) {
            root = null;
        } else if (lastNodeParent.left == lastNode) {
            lastNodeParent.left = null;
        } else {
            lastNodeParent.right = null;
        }
    }   

    //------------------------------------------------------------------------------------
     breadth(root,f);
     f.writeBytes("\r\n");
     f.close();
    }  


//=============================================================
  void f4() throws Exception
    {clear();
     loadData(10);
     String fname = "f4.txt";
     File g123 = new File(fname);
     if(g123.exists()) g123.delete();
     RandomAccessFile  f = new RandomAccessFile(fname, "rw"); 
     breadth(root,f);
     f.writeBytes("\r\n");
    //------------------------------------------------------------------------------------
     /*You must keep statements pre-given in this function.
       Your task is to insert statements here, just after this comment,
       to complete the question in the exam paper.*/

     // Perform breadth-first traversal
    Queue q = new Queue();
    Node parent = null;
    Node p = root;

    while (p != null) {
        fvisit(p, f);

        // Check if the current node has a left son and its price is less than 7
        if (p.left != null && p.left.info.price < 7) {
            // Perform a right rotation on this node
            p = rotateRight(p, parent);
        }

        parent = p;
        if (p.left != null) {
            q.enqueue(p.left);
        }
        if (p.right != null) {
            q.enqueue(p.right);
        }
        p = (Node) q.dequeue();
    }


    //------------------------------------------------------------------------------------
     breadth(root,f);
     f.writeBytes("\r\n");
     f.close();
    }
