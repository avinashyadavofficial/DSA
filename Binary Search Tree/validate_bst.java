
public class validate_bst {
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
    public static boolean isvalid(Node root, Node min, Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;

        }
        if(max!=null && root.data>=max.data){
            return false;
        }
        return isvalid(root.left, min, root) && isvalid(root.right, root, max);

    }
    public static void main(String[] args) {
        int values[]={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        System.out.println(isvalid(root, null, null));
        
        
        

        

    }
    
}
