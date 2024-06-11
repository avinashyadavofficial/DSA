import java.util.*;
public class check_palindrome {
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
    public void addlast(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
   
    //SLOW_FAST Approach
    //here we used Node findmid bcz we have to return midNode
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//slow is my midNode
    }
    public boolean checkpalindrome(){
        //head==null means khali and head.next==null means ek element hai
        if(head==null || head.next==null){
            return true;
        }
        //step1-find mid
        Node midNode=findmid(head);

        //step2- reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        } 
        Node right=prev; //right half head
        Node left=head;//left half head

        //step3-check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        check_palindrome ll=new check_palindrome();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(1);
        
        System.out.println(ll.checkpalindrome());



    }
    
}
