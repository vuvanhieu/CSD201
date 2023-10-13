// Modified preOrder method to only display nodes within the [3, 5] price interval
    void preOrder2(Node p, RandomAccessFile f) throws Exception {
        if (p == null) return;
        if (p.info.price >= 3 && p.info.price <= 5) {
            fvisit(p, f);
        }
        preOrder2(p.left, f);
        preOrder2(p.right, f);
    }


//=============================================================
  void f2() throws Exception
    {clear();
     loadData(4);
     String fname = "f2.txt";
     File g123 = new File(fname);
     if(g123.exists()) g123.delete();
     RandomAccessFile  f = new RandomAccessFile(fname, "rw"); 
     preOrder(root,f);
     f.writeBytes("\r\n");
    //------------------------------------------------------------------------------------
     /*You must keep statements pre-given in this function.
       Your task is to insert statements here, just after this comment,
       to complete the question in the exam paper.*/

    // Perform modified pre-order traversal
    preOrder2(root, f);

    //------------------------------------------------------------------------------------
     f.writeBytes("\r\n");
     f.close();
    }  
