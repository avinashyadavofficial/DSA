import java.util.*;

public class odd_or_even {
    public static String sol(int num){
        int a =num & 1;
        if(a==0){
            return "Even number";
        }
        else{
            return "Odd number";
        }
    }
    public static void main(String args[]){
        int num=687;
        System.out.println(sol(num));
    }
    
}
