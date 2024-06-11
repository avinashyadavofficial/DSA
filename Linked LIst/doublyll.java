public class doublyll {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addfirst(int data){

       
        //step 1: create new node
        Node newNode=new Node(data);
        size++;
        //if linkedlist is empty.
        if (head==null){
            head=tail=newNode;
            return;
        }
        //step 2: newNode next=head  -- to link
        newNode.next=head;
        //step 3
        head.prev=newNode;
        //step 4: head= newNode
        head=newNode;
    }
    //remove
    public int removefirst(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void print(){ // o(n)
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;

        }  
        head=prev;            
    }
    public static void main(String[] args) {
        doublyll dll=new doublyll();  
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1); 
        dll.print();
        System.out.println(dll.size);
        dll.removefirst();
        dll.print();
        System.out.println(dll.size);
        dll.reverse();
        dll.print();


    }
    
}
