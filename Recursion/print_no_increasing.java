

public class print_no_increasing {
    public static void printincr(int n){
        if(n==1){
            System.out.println(n);
            return; 
        }
        printincr(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String args[]){
        printincr(10);

    }
    
}
