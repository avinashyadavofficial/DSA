public class removeDuplicates {
    public static void duplicates(String str, int idx ,StringBuilder newStr, boolean map[]){
        //base
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            
        }
        else{
            map[currchar-'a']=true;
            newStr.append(currchar);
             
        }
        duplicates(str, idx+1, newStr, map);
        

        

    }
    
    public static void main(String[] args) {
        String str="appnnacollege";
        duplicates(str,0,new StringBuilder("") ,new boolean[26]);
        
        
        
    }
    
}
