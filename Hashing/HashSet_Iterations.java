import java.util.*;
public class HashSet_Iterations {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);

        // //Iterator-method 1
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //method 2 
        // for (Integer j : hs) {
        //     System.out.println(j);
            
        // }
    }
    
}
