import java.util.*;

public class syntax {
    public static int Calculatesum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=Calculatesum(num1, num2);
        System.out.println(ans);

    } 
    
}
