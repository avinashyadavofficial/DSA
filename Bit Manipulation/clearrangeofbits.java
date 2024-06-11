import java.util.*;

public class clearrangeofbits {
    public static int sol(int num,int i,int j){
        int a =(~0)<<(j+1);
        int b=(1<<i)-1;
        return num & (a|b);
        
        

    }
    public static void main(String args[]){
        int num=10;
        int i=2;
        int j=7;
        System.out.println(sol(num, i,j));
    }
    
}
