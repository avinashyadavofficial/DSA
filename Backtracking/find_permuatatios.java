public class find_permuatatios {
    public static void permutation(String str, String ans){
        //base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recusion
        for(int i=0;i<str.length();i++){
            //"abcd"=>"ab"+"de"="abde"
            String newstr=str.substring(0, i)+ str.substring(i+1);
            permutation(newstr, ans+str.charAt(i));
        }
    }
  
    public static void main(String[] args) {
        permutation("abc","");
        


        
    }
}
