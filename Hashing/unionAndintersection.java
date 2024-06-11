import java.util.*;
public class unionAndintersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer>set=new HashSet<>();
        //union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        
        }

        System.out.println("Union : "+ set.size());
        for (Integer i : set) {
            System.out.print(i+" ");
        }
        System.out.println();

        //intersection
        int count=0;
        HashSet<Integer>set1=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set1.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
                count++;
                set1.remove(arr2[i]);
            }
            
        
        }
        System.out.println();
        System.out.println("Intersection : "+count);
        
    
    }
}
