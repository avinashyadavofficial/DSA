import java.util.*;
public class largest_string {
    public static String sol(String str[]){
        String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareToIgnoreCase(str[i])<0){
                largest=str[i];
            }
           
        }
        return largest;
    }
    public static void main(String args[]){
        String str[]={"Xpple","mango","banana"};
        System.out.println(sol(str));
    }
    
}
