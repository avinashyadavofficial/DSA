public class friends_pairing_problem {
    public static int frnds(int n){
        //base
        if(n==1||n==2){
            return n;
        }
        //kaam
        //single
        int sing=frnds(n-1);
        
        //pair
        int pair=(n-1)*frnds(n-2);
        int totalways=sing+pair;
        return totalways;

    }
    public static void main(String[] args) {
        System.out.println(frnds(3));
        
    }
}
