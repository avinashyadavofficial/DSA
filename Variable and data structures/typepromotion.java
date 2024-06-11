public class typepromotion {
    public static void main(String args[]){
       // Explanation of point 1
        // char a='a';
        // char b='b';
        // System.out.println(a);//a
        // System.out.println(b);//b
        // System.out.println(b-a);//1--> because ye expression hai to promoted to int so 98-97 equals to 1.

        //Explanation of point 2
        int c=10;
        float d=10.5f;
        long e=20;
        double f=30;
        double ans=c+d+e+f; 
        System.out.println(ans); // 70.5 --> Yaha sabko double me convert karke expression double me tha 
                                 // and ans bhi double se assign hai so no issue or error
        int ans1=c+d+e+f; 
        System.out.println(ans1); // error:-->  possible lossy conversion from double to int
        // yaha pe expression ki value double me hai and ans1 int me hai to loosy conversion



    }
}
