public class grid_ways {
    public static int grid(int i,int j,int n,int m){
        //base
        if(i==n-1 && j==m-1){ // cond to last cell
            return 1;
        }
        else if(i==n || j==m){ // boundary cross cond
            return 0;
        }
        int w1=grid(i+1, j, n, m);
        int w2=grid(i, j+1, n, m);
        return w1+w2;

    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);

    }
    public static int trick(int n, int m){
        int ans=factorial(n-1+m-1)/(factorial(n-1)*factorial(m-1));
        return ans;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(grid(0,0, n, m));
        System.out.println(trick(n, m));
        
    }
}
