void insert(String xOwner, int xPrice) {
    if (xOwner.charAt(0) == 'B' || xPrice > 100) {
        System.out.println("Car not inserted due to condition.");
        return; // Do nothing if the condition is met
    }
    
    root = insertRec(root, xOwner, xPrice);
}

private Node insertRec(Node root, String xOwner, int xPrice) {
    if (root == null) {
        root = new Node(new Car(xOwner, xPrice));
        return root;
    }

    if (xPrice < root.info.price) {
        root.left = insertRec(root.left, xOwner, xPrice);
    } else if (xPrice >= root.info.price) {
        root.right = insertRec(root.right, xOwner, xPrice);
    }

    return root;
}

  

  void f1() throws Exception
    {/* You do not need to edit this function. Your task is to complete insert  function
        above only.
     */
     clear();
     loadData(1);
     String fname = "f1.txt";
     File g123 = new File(fname);
     if(g123.exists()) g123.delete();
     RandomAccessFile  f = new RandomAccessFile(fname, "rw"); 
     preOrder(root,f);
     f.writeBytes("\r\n");

     f.close();
    }  
