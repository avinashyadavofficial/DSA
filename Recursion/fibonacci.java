
// find nth fibonacci no
public class fibonacci {
    public static int fib(int n){
        if(n==0){
            return 0;
        } 
        if(n==1){
            return 1;
        }
        
        int ans=fib(n-1)+fib(n-2);
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
    
}
