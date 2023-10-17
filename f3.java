void breadth(Node p, RandomAccessFile f) throws Exception
    {if(p==null) return;
     Queue q = new Queue();
     q.enqueue(p);Node r;
     while(!q.isEmpty())
       {r = q.dequeue();
        fvisit(r,f);
        if(r.left!=null) q.enqueue(r.left);
        if(r.right!=null) q.enqueue(r.right);
       }
    }


  Node q123= null;
  void breadth2(Node p)
    {if(p==null) return;
     Queue q = new Queue();
     q.enqueue(p);Node r;
     while(!q.isEmpty())
       {r = q.dequeue();
        if(r.left!=null && r.right!=null && r.info.price < 7) {q123=r;break;};
        if(r.left!=null) q.enqueue(r.left);
        if(r.right!=null) q.enqueue(r.right);
       }
    }

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



    //------------------------------------------------------------------------------------
    q123=null;
    breadth2(root);
    if(q123!=null)  deleByCopy(q123.info.price);
     //--------------------------------------------------------
     breadth(root,f);
     f.writeBytes("\r\n");
     f.close();
    }  
