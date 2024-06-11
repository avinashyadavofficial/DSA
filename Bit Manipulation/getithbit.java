import java.util.*;

public class getithbit {
    public static int sol(int num,int i){
        int ans=(num & (1<<i));
        if(ans==0){
            return 0;
        }
        else{
            return 1;
        }

    }
    public static void main(String args[]){
        int num=15;
        int i=4;
        System.out.println(sol(num, i));
    }
    
}
