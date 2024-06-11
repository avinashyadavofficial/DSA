import java.util.Stack;

public class valid_parenthesis {
    public static boolean isvalid(String str){
        Stack<Character>s=new Stack<>();
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            //opening
            if(ch=='(' ||ch=='{'||ch=='[' ){
                s.push(ch);
            }
            //closing
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')')||(s.peek()=='{' && ch=='}')||(s.peek()=='[' && ch==']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
            

        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="({[]}())";
        System.out.println(isvalid(str));

    }
    
}
