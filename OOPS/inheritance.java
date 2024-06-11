public class inheritance {
    public static void main(String[] args) {
        Fish whale=new Fish();
        whale.eat();
    }
    
}
//Parent Class
class Animal{
    String color; //Properties

    void eat(){  //methods
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }


}
//Child Class

class Fish extends Animal{
   

    void swim(){
        System.out.println("swims");
    }
}
