import java.util.*;
public class typecasting {
    public static void main(String args[]){
        float a=20.5f;
        // //type_conversion----> isme implicit conversion hota hai
        // int b=a;
        // System.out.println(b); // Error: lossy conversion from float to int
        
        // //typecasting--> isme Explicit conversion hota hai
        // int c= (int)a; 
        // System.out.println(c); // prints 20
        
        // float d=20.9999999f;
        // int e= (int)d;
        // System.out.println(e); // prints 21

        char ch='a';
        char ch2='b';
        int num1=ch;
        int num2=ch2;
        int num3=(int)ch;
        String var="Avi";
        int num4=var;
        System.out.println(num1);//97
        System.out.println(num2);//98
        System.out.println(num3);//97
        System.out.println(num4); // Error: String cant be converted to int
        


    }   
     
}
