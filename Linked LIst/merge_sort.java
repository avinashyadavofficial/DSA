import java.util.LinkedList;
public class merge_sort {
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

    private Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergedll=new Node(-1);
        Node temp=mergedll;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
                head1=head1.next;
                temp=temp.next;

        }
        while(head2!=null){
            temp.next=head2;
                head2=head2.next;
                temp=temp.next;

        }
        return mergedll.next;
    }

    public Node mergesort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getmid(head);
         //left amd right ms
         Node rightHead=mid.next;
         mid.next=null;
         Node newLeft=mergesort(head);
         Node newRight=mergesort(rightHead);

         //merge
         return merge(newLeft,newRight);
    }
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll);
        System.out.println(ll.mergesort(head));
    }
    
}
 