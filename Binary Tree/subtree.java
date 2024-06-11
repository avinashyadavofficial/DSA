
public class subtree {
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
    public static boolean identical(Node root , Node subroot){
        if(root==null && subroot==null){
            return true;
        }
        if(root==null || subroot==null || root.data!=subroot.data){
            return false;
        }
        if(!identical(root.left, subroot.left)){
            return false;
        }
        if(!identical(root.right, subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean check_subtree(Node root, Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(identical(root,subroot)){
                return true;
            }
        }
        return check_subtree(root.left, subroot) || check_subtree(root.right, subroot);
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        subroot.right.left=new Node(6);
        System.out.println(check_subtree(root, subroot));
        

        
    }
    
}
