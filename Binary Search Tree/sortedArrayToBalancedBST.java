public class sortedArrayToBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node balancedbst(int arr[],int s,int e){
        if(s>e){
            return null;
        }
        int mid=(s+e)/2;
        Node root=new Node(arr[mid]);
        root.left=balancedbst(arr,s, mid-1);
        root.right=balancedbst(arr, mid+1, e);
        return root;


    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        Node root=balancedbst(arr,0,arr.length-1);
        preorder(root);
        
    }
    
    
}
