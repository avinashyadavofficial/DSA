import java.util.*;

public class basic {
    public static void main(String args[]){
        //How to initialise---2 ways
        String str="Avi";
        String str2=new String("nash");

        //Input Output
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);

        //Concatenation
        String fullname=str+str2;
        System.out.println(fullname);

        //Indexing
        System.out.println(fullname.charAt(0));

        //Print all character of the string name
        for(int i=0;i<fullname.length();i++){
            System.out.print(fullname.charAt(i)+" ");
        }
        System.out.println();
        //String length
        System.out.println(fullname.length());





    }
    
}
