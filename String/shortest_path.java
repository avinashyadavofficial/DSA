import java.util.*;

public class shortest_path {
    public static float sol(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            int m=str.charAt(i);
            if(m=='N'){
                y++;
            }
             if(m=='S'){
                y--;
            }
             if(m=='E'){
                x++;
            }
             if(m=='W'){
                x--;
            }
            
        }
        double a=x*x+y*y;
        float ans=(float)Math.sqrt(a);
        return ans;
    }
    public static void main(String args[]){
        String str="WNEENESENNN";
        System.out.println(sol(str));

    }
    
}
