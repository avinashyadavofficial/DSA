import java.util.*;
public class max_length_chain_of_pairs {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int ans=1;
        int lastend=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>=lastend){
                ans+=1;
                lastend=pairs[i][1];
            }
        }
        System.out.println(ans);
    }
    
}
