import java.util.*;

public class basic {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    
    public static Node head;
    public static Node tail;
    public static int size;

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
        //step 3: head= newNode
        head=newNode;
    }
    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        //if linkedlist is empty.
        if (head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addmiddle(int data,int idx){
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removefirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        size--;
        int val=head.data;
        head=head.next;
        return val;
    }
    public int removelast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        
        Node prev=head;
        //prev:i=size-2
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int search_iterative(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;

        }
        //key not found
        return -1;
    }
    public int helper(Node head,int key){
        //base
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int search_recursive(int key){
        return helper(head,key);
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
        Node prev=null;
        Node curr=tail=head;//pahle head ke value tail me assign hua phir tail ki value curr me
                            //java me value right to left assign hota hai
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }  
        head=prev;            
    }
    public void deleteNthFromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;//remove first
            return;
        }
        //sz-n
        int i=1;
        int idx=sz-n;
        Node prev=head;
        while(i<idx){
            prev=prev.next;
            i++;

        }
        prev.next=prev.next.next;
        return;
    }
    


    public static void main(String[] args) {
        basic ll=new basic();
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.addlast(6);
        ll.addlast(7);
        ll.addlast(9);

        ll.print();
        ll.addmiddle(8, 2);
        ll.print();
        
        ll.removefirst();
        ll.print();
        ll.removelast();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.search_iterative(3));
        System.out.println(ll.search_iterative(5));
        System.out.println(ll.search_recursive(3));
        System.out.println(ll.search_recursive(5));
        ll.reverse();
        ll.print();
        ll.deleteNthFromEnd(2);
        ll.print();
        
        
    }
    
}
