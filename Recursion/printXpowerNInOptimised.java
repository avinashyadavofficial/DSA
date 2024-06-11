public class printXpowerNInOptimised {
    public static int optimised(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimised(x, n/2);
        if(n%2==0){
            return halfpower*halfpower;
        }
        else{
            return x* halfpower*halfpower;
        }
    }
    public static void main(String[] args) {
        System.out.println(optimised(2,5));

        
    }
    
}

