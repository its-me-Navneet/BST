public class BST<T extends Comparable <T>> {
   
    // private Node<T>root ;
    

    public Node<T> insert(Node<T> root, T data) {
        
      
        if(root == null){
            return new Node<>(data) ; 
        
        }
  
        if(root.data.compareTo(data)  < 0 ){
           root.right = insert(root.right,data) ;
        }
        else if (root.data.compareTo(data) > 0){
             root.left = insert(root.left,data) ;
        }
        
            return root ; 
   
    
    }

    public void inorderTrav(Node<T> root){
      
         if(root == null) return  ;

         inorderTrav(root.left);
         System.out.print(root.data+ " ");
         inorderTrav(root.right);
    }

    public boolean search(T key, Node<T> root){

         if(root == null) return false ; 

          if(root.data.compareTo(key) > 0) return search(key, root.left);
          else if(root.data.compareTo(key) < 0 ) return search(key, root.right);
          return  true ; 
         
    }

}
