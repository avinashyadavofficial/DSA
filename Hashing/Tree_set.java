import java.util.*;
public class Tree_set {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(2);
        ts.add(4);
        ts.add(2);
        ts.add(1);

        System.out.println(ts); //[1, 2, 4, 5]
    }
    
}
