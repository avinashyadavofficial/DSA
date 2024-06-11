import java.util.*;

public class clearIthbit {
    public static int sol(int num,int i){
        return (num &(~(1<<i)));
        

    }
    public static void main(String args[]){
        int num=10;
        int i=1;
        System.out.println(sol(num, i));
    }
    
}
