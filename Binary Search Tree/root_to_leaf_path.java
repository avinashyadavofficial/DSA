import java.util.*;
public class root_to_leaf_path {
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
    public static void printpath(ArrayList<Integer>path){
       for(int i=0;i<path.size();i++){
          System.out.print(path.get(i)+"->");
       }
       System.out.println("NULL");
    }
    public static void path_node(Node root, ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printpath(path);
        }
        path_node(root.left, path);
        path_node(root.right, path);
        path.remove(path.size()-1);

    }
    public static void main(String[] args) {
        int values[]={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        path_node(root, new ArrayList<>());
        
        

        

    }
    
}
