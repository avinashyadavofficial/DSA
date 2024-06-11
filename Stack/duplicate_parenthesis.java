import java.util.Stack;

public class duplicate_parenthesis {
    public static boolean isduplicate(String str){
        Stack<Character>s=new Stack<>();
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            //closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    
                    s.pop();
                    count++;
                }
                if(count<1){
                    return  true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);

            }

        }return false;
    }
    public static void main(String[] args) {
        String str="((a+b)+(c+d))";
        System.out.println(isduplicate(str));

    }
    
}
