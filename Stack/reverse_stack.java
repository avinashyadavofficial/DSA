import java.util.Stack;

public class reverse_stack {
    public static void push_at_bottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        
        push_at_bottom(s, data);
        s.push(top);
        



    }
    public static void reversestack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reversestack(s);
        push_at_bottom(s, top);

    }
    public static void printstack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
            
        }
    }
    
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        reversestack(s);
        printstack(s);

    }
    
}
