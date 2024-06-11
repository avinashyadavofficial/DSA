public class diameter {
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }
    //Approach 1-->O(N^2)
    public static int diam(Node root){
        //O(N^2) method
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        int ld=diam(root.left);
        int rd=diam(root.right);
        int selfdiam=lh+rh+1;
        return Math.max(selfdiam,Math.max(ld,rd));

    }
    //Approach 2---> O(N) -- using class info so that we dont need to do recursion separetely for height and diameter.
    static class info{
        int d;
        int h;
        public info(int d, int h){
            this.d=d;
            this.h=h;
        }
    }
    public static info diam2(Node root){
        if(root==null){
            return new info(0, 0);
        }
        info linfo=diam2(root.left);
        info rinfo=diam2(root.right);
        int d=Math.max((linfo.h+rinfo.h+1),Math.max(linfo.d,rinfo.d));
        int h=Math.max(linfo.h,rinfo.h)+1;
        return new info(d, h);

    }

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println(diam(root));
        System.out.println(diam2(root).d);

        
    }
    
}
