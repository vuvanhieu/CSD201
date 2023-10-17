void deleByCopy(int xPrice)
   {if(root==null)
       {System.out.println(" The tree is empty, no deletion");
        return;
       }
    Node f,p; // f will be the father of p
    p=root;f=null;
    while(p!=null)
     {if(p.info.price == xPrice) break;//Found key x
      if(xPrice < p.info.price)
        {f=p;p=p.left;}
        else
        {f=p;p=p.right;}
     }
    if(p==null)
     {System.out.println(" The key " + xPrice + " does not exist, no deletion");
      return;
     }
    if(p.left==null && p.right==null) // p is a leaf node
     {if(f==null) // The tree is one node
       root=null; 
        else
        {if(f.left==p)
          f.left=null;
           else
            f.right=null;
        }
      return;
     }

    if(p.left!=null && p.right==null) // p has only left child
     {if(f==null) // p is a root
       root=p.left; 
        else
        {if(f.left==p) // p is a left child
           f.left=p.left;
            else 
             f.right=p.left;
        }
      return;
     }

    if(p.left==null && p.right!=null) // p has only right child
     {if(f==null) // p is a root
       root=p.right; 
        else
        {if(f.left==p) // p is aleft child
           f.left=p.right;
            else 
             f.right=p.right;
        }
      return;
     }

    if(p.left!=null && p.right!=null) // p has both left and right children
     {Node q,fr,rp; // p's key will be replaced by rp's one
      fr=null;
      q = p.left;
      rp = q;
      while(rp.right!=null) 
       {fr=rp; rp = rp.right; // Find the right most node on the left sub-tree
       }
      p.info = rp.info;
      if(fr==null) // rp is just a left son of p 
      p.left=rp.left;
       else
        fr.right=rp.left;
     }
   
   }

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
