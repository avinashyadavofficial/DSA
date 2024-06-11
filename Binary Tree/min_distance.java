public class min_distance {
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
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;

        }
        int leftd=lcaDist(root.left, n);
        int rightd=lcaDist(root.right, n);
        if(leftd==-1 && rightd==-1){
            return -1;
        }
        else if(leftd==-1){
            return rightd+1;
        }
        else{
            return leftd+1;
        }
    }
    public static int minDistance(Node root,int n1,int n2){
        Node lca=approach2(root, n1, n2);
        int dis1=lcaDist(lca,n1);
        int dis2=lcaDist(lca,n2);
        return dis1+dis2;
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
        System.out.println(minDistance(root, n1, n2));
        
        

        
    }
    
}
