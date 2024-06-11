import java.util.*;

public class else_if {
    public static void main(String args[]){
        int a =20;
        int b=10;
        int c=30;
        if((a>b)&&(a>c)){
            System.out.println("a is greatest");
        }
        else if(b>c){
            System.out.println("b is greatest");

        }
        else{
            System.out.println("c is greatest");
        }
        
        
    }
}
