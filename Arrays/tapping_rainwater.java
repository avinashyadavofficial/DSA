import java.util.*;

public class tapping_rainwater {
    public static int sol(int height[]){
        if(height.length<=2){
            return 0;
        }
        int ans=0;
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
            rightmax[height.length-1-i]=Math.max(rightmax[height.length-i],height[height.length-1-i]);
        }
        
        
        for(int i=0;i<height.length;i++){
            int wl=Math.min(leftmax[i],rightmax[i]);
            int area=wl-height[i];
            if(area<0){
                area=0;
            }
            ans+=area;
        }
        return ans;
        


    }
    public static void main(String args[]){
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int ans=sol(height);
        if(ans>0){
            System.out.println(ans);

        }
        else{
            System.out.println(0);
        }
        


    }
    
}
