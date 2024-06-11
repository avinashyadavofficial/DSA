public class delete_node {
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
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right, val);

        }
        else if(root.data>val){
            root.left=delete(root.left, val);
        }
        else{
            //delete
            //case 1 no child
            if(root.left==null && root.right==null){
                 return null;
            }
            //case 2 one child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3
            Node inorderSuccessor=findinordersuccessor(root.right);
            root.data=inorderSuccessor.data;
            root.right=delete(root.right, inorderSuccessor.data);

        }
        return root;
    }
    public static Node findinordersuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        inorder(root);
        System.err.println();
        delete(root, 5);
        inorder(root);
        

    }
    
}
