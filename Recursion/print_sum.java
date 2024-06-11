

public class print_sum {
    public static int printsum(int n){
        if(n==0){
            return 0;

        }
       
        int sum=n+printsum(n-1);
        System.out.println(sum);
        return sum;


    }
    public static void main(String[] args) {
        
        System.out.println(printsum(5));
        
    }
    
}
