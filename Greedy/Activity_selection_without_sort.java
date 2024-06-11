import java.util.*;
public class Activity_selection_without_sort {
    public static void activity(int start[],int end[]){
        //end time is not sorted so sorting using matrix
        int matrix[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            matrix[i][0]=i;
            matrix[i][1]=start[i];
            matrix[i][2]=end[i];
        }
        //lambd fun to sort matrix of column end.
        Arrays.sort(matrix,Comparator.comparingDouble(o -> o[2]));


        ArrayList<Integer>a=new ArrayList<>();
        int count=0;
        a.add(matrix[0][0]);
        count=1;
        int lastend=matrix[0][2];
        for(int i=1;i<start.length;i++){
            if(matrix[i][1]>=lastend){
                count++;
                a.add(matrix[i][0]);
                lastend=matrix[i][2];
            }
        }
        System.out.println("Maximum activity = "+ count);
        for(int i =0;i<a.size();i++){
            System.out.println("A"+a.get(i));
        }
        
    }
    public static void main(String[] args) {
        int start[]={3,1,0,5,8,5};
        int end[]={4,2,6,7,9,9};
        activity(start, end);
        
    }
    
}
