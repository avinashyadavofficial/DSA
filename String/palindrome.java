import java.util.*;

public class palindrome {
    public static boolean sol(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
                
            }
            
            
        }
        return true;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(sol(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    
}
