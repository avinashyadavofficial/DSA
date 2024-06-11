import java.util.*;
import java.util.HashMap;
public class hashmap{
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm=new HashMap<>();
        //insert
        hm.put("India",100);
        hm.put("China", 150);
        hm.put("US",50);
        System.out.println(hm);
        //get
        int population=hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Pakistan"));

        //ContainsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey(("Pakistan")));

        //remove
        System.out.println(hm.remove("China"));
        //print
        System.out.println(hm);
        //size
        System.out.println(hm.size());
        //is empty
        System.out.println(hm.isEmpty());
        //clear
        hm.clear();
        System.out.println(hm.isEmpty());

       
    }

}