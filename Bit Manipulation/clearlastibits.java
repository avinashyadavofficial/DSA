import java.util.*;

public class clearlastibits {
    public static int sol(int num,int i){
        return (num &(-1<<i));
        

    }
    public static void main(String args[]){
        int num=15;
        int i=2;
        System.out.println(sol(num, i));
    }
    
}
