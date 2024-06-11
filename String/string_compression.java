import java.util.*;
public class string_compression {
    public static String sol(String str){
        StringBuilder sb= new StringBuilder("");
        
        for(int i=0;i<str.length();i++){
            
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;


            }
            sb.append(str.charAt(i));
            if(count>0){
                sb.append(count.toString());
            }
            
  
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="aaaabbbcccdde";
        System.out.println(sol(str));
    }
    
}
