import java.util.*;
public class remove_loop_or_cycle{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    
    public static Node head;
    public static Node tail;

    public static void removecycle(){
        //cycle exists
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow==fast){
                cycle= true;//cycle exists
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }


        //remove cycle->last.next=null
        prev.next=null;

    }
    
    

    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        //1->2->3->2
        removecycle();
        
        

        



    }
    
}
