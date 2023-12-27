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
         System.out.println(root.data);
         inorderTrav(root.right);
    }

}
