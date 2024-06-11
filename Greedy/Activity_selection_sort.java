import java.util.*;
public class Activity_selection_sort {
    public static void activity(int start[],int end[]){
        //end time is already sorted
        ArrayList<Integer>a=new ArrayList<>();
        int count=0;
        a.add(0);
        count=1;
        int lastend=end[0];
        for(int i=1;i<start.length;i++){
            if(start[i]>=lastend){
                count++;
                a.add(i);
                lastend=end[i];
            }
        }
        System.out.println("Maximum activity = "+ count);
        for(int i =0;i<a.size();i++){
            System.out.println("A"+a.get(i));
        }
        
    }
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        activity(start, end);
        
    }
    
}
