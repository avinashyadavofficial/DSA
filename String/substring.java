import java.util.*;
public class substring {
    public static String sol(String str,int si,int ei){
        String ans="";
        for(int i=si;i<ei;i++){
            ans+=str.charAt(i);
        }
        return ans;
    }
    public static void main(String args[]){
        String str="Helloworld";
        //Using above self created function
        System.out.println(sol(str,3,5));
        
        //Using inbuilt function
        System.out.println(str.substring(3, 5));

    
        
    }
    
}
