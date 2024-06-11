public class super_keyword {
    public static void main(String[] args) {
        Horse h= new Horse();
        System.out.println(h.color);
    }
    
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{

    Horse(){
        super();
        super.color="red";
        
        System.out.println("Horse constructor is called");
    }
}
