public class revision {
    public static void main(String[] args) {
        Fish khushi=new Fish();
        khushi.eat();

        
    }
    
}
//Parent Class
class Animal{
    

    void eat(){  //methods
        System.out.println("eats animal");
    }

    

}
//Child Class

class Fish extends Animal{
   

    void eat(){
        System.out.println("eats fish");
    }
}
