public class App {
    

    public static void main(String[] args) {
        

        BST<Integer> bst = new BST<Integer>() ; 
        Node<Integer>  root = bst.insert(null, 56) ;
        bst.insert(root, 30) ;
        bst.insert(root, 70) ;

        bst.inorderTrav(root);

    }
}
