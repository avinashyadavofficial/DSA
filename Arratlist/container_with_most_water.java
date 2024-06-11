import java.util.*;
public class container_with_most_water {
    public static int storewater(ArrayList<Integer>height){
        int maxwater=0;
        //bruteforce
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currwater=ht*width;
                maxwater=Math.max(maxwater, currwater);

            }
        }
        return maxwater;
    }
    public static int two_pointer_approach(ArrayList<Integer>height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;

        while(lp<rp){
            //calculate water area
            int ht=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(maxwater, currwater);

            //update pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
        
    }

    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storewater(height));
        System.out.println(two_pointer_approach(height));
    }
    
}
