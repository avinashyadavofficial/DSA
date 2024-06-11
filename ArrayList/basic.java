import java.util.ArrayList;
public class basic {
    public static void main(String args[]){
        //Java Collection framework: jo inbuilt java me hota hai such as arraylist
        //ClassName obj=new ClassName();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
        //add
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(1,9); 
        System.out.println(list);
        //get
        int element =list.get(1);
        System.out.println(element);
        //remove
        list.remove(1 );
        System.out.println(list);

        //set element at index
        list.set(2,10);
        System.out.println(list);
        //contains element
        System.out.println(list.contains(1));
        //size
        System.out.println(list.size());
        //print arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //reverse print
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();





    }
    
}
