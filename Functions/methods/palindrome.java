import java.util.Scanner;

public class palindrome {
    public static int reverse(int num){
        int ans=0;
        while (num>0){
            
            int ld=num%10;
            ans=ans*10+ld;
            num=num/10;


        }
        return ans;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==reverse(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
    
}
