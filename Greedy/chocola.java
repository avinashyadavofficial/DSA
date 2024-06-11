import java.util.*;
public class chocola {
    public static void main(String[] args) {
        
        Integer ver_cost[]={2,1,3,1,4};
        Integer hor_cost[]={4,1,2};
        Arrays.sort(ver_cost,Collections.reverseOrder());
        Arrays.sort(ver_cost,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;
        while(h<hor_cost.length && v<ver_cost.length){
            if(hor_cost[h]<=ver_cost[v]){
                //vertical cut
                cost+=(ver_cost[v]*hp);
                vp++;
                v++;
                
            }
            else{
                //horizontal cut
                cost+=(hor_cost[h]*vp);
                hp++;
                h++;
            }
            

        }
        
        while(h<hor_cost.length){
            cost+=(hor_cost[h]*vp);
            hp++;
            h++;
        }
        while(h<ver_cost.length){
            cost+=(ver_cost[h]*hp);
            vp++;
            v++;
        }
        
        System.out.println(cost);
        
    }
    
}
