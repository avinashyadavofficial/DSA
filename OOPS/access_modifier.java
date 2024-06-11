public class access_modifier {
    public static void main(String args[]){
        Bankacount myacc=new Bankacount();
        myacc.username="Avinash Yadav";
       // myacc.password="abcd";  // Here password cant be call bcz password is private.
       myacc.setpassword("abcd");
       System.out.println(myacc.username);
       System.out.println(myacc.getpassword());
   
    }      
    
}
class Bankacount{
        public String username;
        private String password;
        public void setpassword(String psd){
            password=psd;
        }
        public String getpassword(){
            return password;

        }
    }
