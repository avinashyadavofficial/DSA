public class multiple_inheritance {
    public static void main(String[] args) {
        Bear b=new Bear();
        b.eatherb();
        b.eatcarn();
    }
    
}
interface herbivore{
    void eatherb();


}
interface carnivore{
    void eatcarn();

    

}
class Bear implements herbivore, carnivore {
    public void eatherb(){
        System.out.println("Bear eat herb");
    }
    public void eatcarn(){
        System.out.println("Beer eat carn");
    }

}