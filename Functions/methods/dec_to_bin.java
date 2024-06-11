import java.util.*;
public class dec_to_bin {
    public static int convert(int dec){
        
        int i=0;
        int ans=0;
        while(dec>0){
            int rem=dec%2;
            ans=ans+rem*(int)Math.pow(10,i);
            dec=dec/2;
            i+=1;


        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(convert(num));

    }
    
}
