import java.util.ArrayList;
import java.util.Arrays;

public class indian_coins {
    public static int sol1(int coins[],int amount){
        int count=0;
        Arrays.sort(coins);
        for(int i =coins.length-1;i>=0;i--){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                count++;
                
                amount-=coins[i];
            
                }
                
                
            }
        }
        return count;
    }
    public static void sol2(Integer coins[],int amount){
        int count=0;
        Arrays.sort(coins);
        ArrayList<Integer>a=new ArrayList<>();
        for(int i =coins.length-1;i>=0;i--){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                count++;
                a.add(coins[i]);
                
                amount-=coins[i];
            
                }
                
                
            }
        }
        System.out.println("Count is "+count);
        for(int i =0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,500,2000};
        int amount=590;
        Integer coins1[]={1,2,5,10,20,50,100,500,2000};
        
        System.out.println(sol1(coins, amount));
        sol2(coins1, amount);
    }
    
}
