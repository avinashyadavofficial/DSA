

public class factorial {
    public  int printfact(int n){
        if(n==0){
            return 1;

        }
        int fac=n*printfact(n-1);
        return fac;


    }
    public static void main(String[] args) {
        factorial f= new factorial();
        
        
        System.out.println(f.printfact(10));
        
    }
    
}
