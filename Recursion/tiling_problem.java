public class tiling_problem {
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical
        int ver=tiling(n-1);
        //horizontal
        int hor=tiling(n-2);
        return ver+hor;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
    
}
