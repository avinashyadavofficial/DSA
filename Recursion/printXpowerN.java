public class printXpowerN {
    public static int printpow(int x, int n){
        if(n==0){
            return 1;
        }
        int ans=x*printpow(x, n-1);
        return ans;





    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(printpow(x, n));
        
    }
}
