
package binarytreesd;
public class BinaryTreeWithLNRTraversal
{  
	
	TreeNode root;
	
   public BinaryTreeWithLNRTraversal()
   { 
	   root = null;
   }
   
   
   public boolean insert(StudentClass newStudent)
   { TreeNodeWrapper p = new TreeNodeWrapper();
      TreeNodeWrapper c = new TreeNodeWrapper();
      TreeNode n = new TreeNode();
      if(n == null) 
          return false;
      else  
      { n.node = newStudent.deepCopy(); 
         n.lc = null;
         n.rc = null;
        if(root == null) 
        {   root = n;  }
        else
        {  findNode(newStudent.getKey(), p, c ); 
            if(newStudent.getKey().compareTo(p.get().node.getKey( )) < 0) 
                 p.get().lc = n;
            else
                 p.get().rc = n;
         }
         return true;
      }
   } 
   
   public StudentClass fetch(String targetKey)
   { boolean found;
      TreeNodeWrapper p = new TreeNodeWrapper();
      TreeNodeWrapper c = new TreeNodeWrapper();
      found =  findNode(targetKey, p, c); 
      if(found == true)
        return c.get().node.deepCopy();
      else
        return null;
   }
   
   public boolean delete(String targetKey)
   { boolean found;
      TreeNodeWrapper p = new TreeNodeWrapper();
      TreeNodeWrapper c = new TreeNodeWrapper();
      
      TreeNode largest; 
      
      TreeNode nextLargest;
      found =  findNode(targetKey, p, c);
      if(found == false) 
         return false;
      else
      { if(c.get().lc == null && c.get().rc == null) 
        { if(p.get().lc == c.get()) 
              p.get().lc = null;
          else                      
              p.get().rc = null;
        }
       else if(c.get().lc == null || c.get().rc == null) 
       { if(p.get().lc == c.get()) 
          { if(c.get().lc != null) 
                p.get().lc = c.get().lc;
            else
                p.get().lc = c.get().rc;
          }
          else                     
          { if(c.get().lc != null) 
                p.get().rc = c.get().lc;
             else
                p.get().rc = c.get().rc;
          }
       }
       else 
       {  nextLargest = c.get().lc;
           largest = nextLargest.rc;
           if(largest != null) 
          {  while(largest.rc != null)  
             {  nextLargest = largest;
                 largest = largest.rc;
             }
             c.get().node = largest.node; 
             nextLargest.rc = largest.lc; 
          }
          else         
          { nextLargest.rc = c.get().rc; 
             if(p.get().lc == c.get())   
                p.get().lc = nextLargest;   
            else                        
               p.get().rc = nextLargest;   
         }
       }
       return true;
     }
   }
   
  
   public boolean update(String targetKey, StudentClass newStudent)
   {  if(delete(targetKey) == false)
           return false;
       else if(insert(newStudent) == false)
           return false;
        return true;
   }
   
   
   public class TreeNode
   {  private StudentClass node;
       private TreeNode lc;
       private TreeNode rc;
       public TreeNode()
      {
      }
   }
   
   
   
   private boolean findNode(String targetKey, TreeNodeWrapper parent,
                                               TreeNodeWrapper child)
   {  parent.set(root);
       child.set(root);
       if(root == null) 
           return true;
      while(child.get( ) != null)
      { if(child.get( ).node.compareTo(targetKey) == 0) 
            return true;
         else
         {  parent.set(child.get( ));
             if(targetKey.compareTo(child.get( ).node.getKey( )) < 0)
                 child.set(child.get( ).lc);
             else
                 child.set(child.get( ).rc);
         }
       }
       return false;
   } 
   
   
   public class TreeNodeWrapper
   { TreeNode treeRef = null;
   
   
      public TreeNodeWrapper()
      {
      }
      
      
      public TreeNode get()
      { return treeRef;
      }
      
      public void set(TreeNode t)
      { treeRef = t;
      }
   }
   
   
   
   public void RNLoutputTraversal(TreeNode root)
   {  if(root.rc != null)
        RNLoutputTraversal(root.rc);
      System.out.println(root.node.toString());  
      if(root.lc != null)
        RNLoutputTraversal(root.lc);  
   } 

   public void showAll( )
   {  if(root == null)  
        System.out.println("the structure is empty");
      else
       
    	  RNLoutputTraversal(root);
  } 
}


