
import java.lang.Math;
import java.util.*;
public class bin_to_dec {
    public static int convert(int num){
        
        int ans=0;
        int i=0;
        while(num>0){

            int ld=num%10;
            ans=ans + ld*(int)Math.pow(2,i);
            num=num/10;
            i+=1;


           
        }
        return ans;
    
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(convert(num));
        
    }

}
