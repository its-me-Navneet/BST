public class App {
    

    public static void main(String[] args) {
        

        BST<Integer> bst = new BST<Integer>() ; 
        Node<Integer>  root = bst.insert(null, 56) ;
        bst.insert(root, 30) ;
        bst.insert(root, 70) ;
        bst.insert(root, 22) ;
        bst.insert(root, 40) ;
        bst.insert(root, 60) ;
        bst.insert(root, 11) ;
        bst.insert(root, 65) ;
        bst.insert(root, 3) ;
        bst.insert(root, 16) ;
        bst.insert(root, 63) ;
        bst.insert(root, 67) ;

        bst.inorderTrav(root); 
   
         System.out.println();
        boolean present = bst.search( 63,root) ;
        System.out.println(" element is present ? " + present);

    }
}
