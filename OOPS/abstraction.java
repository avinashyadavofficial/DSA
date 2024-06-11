public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walks();
        System.out.println(h.color);// brown hi show karega jab tak change color call nahi hoga 
        h.changecolor();
        System.out.println(h.color);// ab black aayega

        chicken c= new chicken();
        c.eat();
        c.walks();
        System.out.println(c.color);
    }
    
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walks();
}
class Horse extends Animal{
      void changecolor(){
        color="black";
    }
    void walks(){
        System.out.println(" Walk with 4 legs");
    }
}
class chicken extends Animal{
    void changecolor(){
        color="yellow";
    }
    void walks(){
        System.out.println("Walk with 2 legs");
    }
}
