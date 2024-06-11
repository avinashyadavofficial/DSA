import java.util.Scanner;

public class sum_of_digit {
    public static int solution(int num){
        int ans=0;
        while(num>0){
            int ld=num%10;
            ans=ans+ld;
            num/=10;
            
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(solution(num));

    }
    
}
