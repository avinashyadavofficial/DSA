import java.util.*;

public class build_bst { 
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root, int values){
        if(root==null){
            root=new Node(values);
            return root;
        }
        if(root.data>values){
            //left subtree
            root.left=insert(root.left, values);
        }
        else{
            //right subtree
            root.right=insert(root.right, values);
        }
        
        return root;
    }
   
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
    
        inorder(root);
    }
    
}
