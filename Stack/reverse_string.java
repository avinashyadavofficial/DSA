import java.util.Stack;

public class reverse_string {
    public static String reverseString(String str){
        Stack<Character>s=new Stack<>();
        int index=0;
        while(index<str.length()){
            s.push(str.charAt(index));
            index++;

        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
            result.append(s.pop());
        }
        return result.toString();

    }

    public static void main(String[] args) {
    
        String str="Avinash";
        System.out.println(reverseString(str));
    }
    
}
