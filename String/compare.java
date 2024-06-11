import java.util.*;
public class compare {
    public static void sol(String s1,String s2){
        if(s1.equals(s2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
    
    public static void main(String args[]){
        String s1="Avi";
        String s2="Avi";
        String s3=new String("Avi");
        // if(s1==s2){
        //     System.out.println("s1 equal s2");
        // }
        //  if(s1==s3){
        //     System.out.println("s1 equal s3");
        // }

       
        sol(s1,s3);
        sol(s2,s3);
        sol(s1,s2);
    
        


        
    }
    
}
