public class Node<T> {
    
    T data ;
    Node<T> left,right ;

    Node(T data){
         this.data = data ;
         this.left =null ;
         this.right = null ;
    }
}
