import java.util.ArrayList;

public class lca {
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
    public static boolean getpath(Node root,int n,ArrayList<Node>path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        if(getpath(root.left, n, path) || getpath(root.right, n, path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lowest_common_ancestor(Node root,int n1,int n2){
        //approach 1
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        getpath(root, n1, path1);
        getpath(root, n2, path2);
        
        //lca
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;

            }
        }
        return path1.get(i-1);

    }
    public static Node approach2(Node root,int n1,int n2){
        if(root==null || root.data==n1||root.data==n2){
            return root;
        }
        Node leftlca=approach2(root.left, n1, n2);
        Node rightlca=approach2(root.right, n1, n2);
        if(leftlca==null){
            return rightlca;
        }
        if(rightlca==null){
            return leftlca;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        int n1=4;
        int n2=6;
        System.out.println(lowest_common_ancestor(root, n1, n2).data);
        System.out.println(approach2(root, n1, n2).data);
        

        
    }
    
}
