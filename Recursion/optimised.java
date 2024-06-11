public class optimised {
    public static int optPower(int a , int n){
        if(n==0){
            return 1;
        }
       int halfPow = optPower(a, n/2);
       if (n%2==0){
        return halfPow * halfPow ; 
       }else{
        return a * halfPow *halfPow;
       }
}

      public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optPower(a, n));
      }
    }