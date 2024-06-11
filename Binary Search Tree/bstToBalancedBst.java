import java.util.*;

public class bstToBalancedBst {
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

    public static Node balancedBST(Node root) {
        // Inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        // Get inorder traversal of the original BST
        getInorder(root, inorder);
        // Sorted to balanced BST
        root = createBST(inorder, 0, inorder.size() - 1);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root = balancedBST(root);
        preorder(root);
    }
}
