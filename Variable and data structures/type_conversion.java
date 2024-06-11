import java.util.*;
public class type_conversion {
    public static void main(String args[]){
        // int a=30;
        // long b=a;
        // System.out.println(b); // 30 as int to long is widening or implicit conversion
        // // isme long ka size bada hai to wo aaram se int ka data le lega so no error
        // long c=30;
        // int d=c;
        // System.out.println(d); // Error : lossy conversion from long to int
        // // isme int ka size chhota hai long se to wo long ka data nahi le payega so  data loss so not possible so errror.

        Scanner sc= new Scanner(System.in);
        float e=sc.nextInt(); //10
        System.out.println(e);//10.0
        //Yaha pe int value float me convert ho gaya
        
        int f=sc.nextFloat(); //10
        System.out.println(f);// error: lossy conversion from float to int

    }   
     
}
