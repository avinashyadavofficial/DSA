import java.util.ArrayList;

public class pairsum2{
    public static boolean bruteforce(ArrayList<Integer>list,int target){
         for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
         }
         return false;
    }public static boolean optimised(ArrayList<Integer>list,int target){
       int n=list.size();
       int bp=-1; //breaking point
       for(int i=0;i<n;i++){
        if(list.get(i)>list.get(i+1)){
            bp=i;
            break;
        }
       }
       int lp=bp+1;//smallest
       int rp=bp;//largest
       while(lp!=rp){
        //case 1
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }
        //case 2
        else if(list.get(lp)+list.get(rp)<target){
            lp=(lp+1)%n;
        }
        else{  
            rp=(n+rp-1)%n;
        }
       }
       return false;
   }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target =16;
        System.out.println(bruteforce(list, target));
        System.out.println(optimised(list, target));
        
    }
    
}
