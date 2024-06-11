import java.util.*;
public class Linked_hashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(2);
        lhs.add(4);
        lhs.add(2);
        lhs.add(1);

        System.out.println(lhs); //[5, 2, 4, 1]
    }
    
    
}
