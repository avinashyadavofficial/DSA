import java.util.*;
public class min_absolute_difference_pairs {
    public static int madp(int a[],int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int ans=0;
        for(int i=0;i<a.length;i++){
            ans=ans+Math.abs(a[i]-b[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={2,1,3};
        System.out.println(madp(a, b));
    }
    
}
