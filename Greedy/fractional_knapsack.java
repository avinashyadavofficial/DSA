import java.util.*;
public class fractional_knapsack {
    public static int fk(int value[],int weight[],int capacity){
        int ratio[]=new int[value.length];
        int ans=0;
        for(int i=0;i<value.length;i++){
            ratio[i]=value[i]/weight[i];
        }
        //if ratio is sorted and in descending
        for(int i=0;i<ratio.length;i++){
            if(capacity>=weight[i]){
                capacity-=weight[i];
                ans+=value[i];
            }
            else{
                ans= ans+(capacity*ratio[i]);
                break;
            }
        }
        return ans;
    }

    //if ratio is not sorted and not in descending order
    public static int fk_withoutsort(int value[],int weight[],int capacity){
        double ratio[][]=new double[value.length][2];
        int ans=0;
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        for(int i=value.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                capacity-=weight[idx];
                ans+=value[idx];
            }
            else{
                ans= ans+(capacity*(int)ratio[i][1]);
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int capacity=50;
        System.out.println(fk(value, weight, capacity));
        
    }
    
}
