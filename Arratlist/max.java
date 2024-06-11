import java.util.ArrayList;


public class max {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(3);
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max, list.get(i));
        }
        System.out.println(max);


    }

    
}
