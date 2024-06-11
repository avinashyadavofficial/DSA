import java.util.*;

public class merge2Bst {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int s, int e) {
        if (s > e) {
            return null;
        }
        int mid = (s + e) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, s, mid - 1);
        root.right = createBST(inorder, mid + 1, e);
        return root;
    }

    public static Node mergebst(Node root1,Node root2) {
       //for bst1
        ArrayList<Integer> bst1 = new ArrayList<>();
        getInorder(root1, bst1);
        //for bst2
        ArrayList<Integer> bst2 = new ArrayList<>();
        getInorder(root2, bst2);
        //merge
        ArrayList<Integer>finalbst=new ArrayList<>();
        int i=0,j=0;
        while(i<bst1.size() && j<bst2.size()){
            if(bst1.get(i)<=bst2.get(j)){
                finalbst.add(bst1.get(i));
                i++;
                    
            }
            else{
                finalbst.add(bst2.get(j));
                j++;
            }
        }
        while(i<bst1.size()){
            finalbst.add(bst1.get(i));
            i++;
        }
        while(j<bst2.size()){
            finalbst.add(bst2.get(j));
            j++;
        }
        // Sorted to balanced BST
        return createBST(finalbst, 0, finalbst.size() - 1);
        
    }
    public static void main(String[] args) {
        //BST1
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);
        //BST2
        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        Node root=mergebst(root1, root2);
        preorder(root);

        
    }
    
}
