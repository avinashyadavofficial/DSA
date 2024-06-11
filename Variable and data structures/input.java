import java.util.*;

public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       //next()
        String a=sc.next();  // Avinash
        System.out.println(a); // Avinash
        // Note: next() can only print one word if input is Avinash Yadav it will print only Avinash.
        String b=sc.next();  // Avinash Yadav
        System.out.println(b); // Avinash
       //nextLine()
        String c=sc.nextLine();  // Avinash Yadav
        System.out.println(c); // Avinash Yadav
       //nextInt()
        int d=sc.nextInt();  // 10
        System.out.println(d); // 10
        //nextFloat()
        float e=sc.nextFloat();  // 3.14
        System.out.println(e); // 3.14
    }
    
}
