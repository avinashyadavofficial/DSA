import java.util.*;

public class while_loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int a=1;
        // while(a<=number){
        //     System.out.println(a);
        //     a++;
        // }
        // Sum of first n natural number
        int sum=0;
        while(a<=number){
            sum=sum+a;
            a++;
        }
        System.out.println("The sum of first "+number+" natural number is "+sum);
    }
}
