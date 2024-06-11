public class mirror_bst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node createmirror(Node root){
        if(root==null){
            return null;
        }
        Node leftsubtree=createmirror(root.left);
        Node rightsubtree=createmirror(root.right);
        root.left=rightsubtree;
        root.right=leftsubtree;
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(10);
        root.right.right=new Node(11);
        preorder(root);
        System.out.println();
        root=createmirror(root);
        preorder(root);
    }

    
}
