import java.util.*;

public class tocheckpowerof2 {
    public static String sol(int num){
        int a =num & (num-1);
        if(a==0){
            return "Power of 2";
        }
        else{
            return "Not power of 2";
        }
    }
    public static void main(String args[]){
        int num=687;
        System.out.println(sol(num));
    }
    
}
