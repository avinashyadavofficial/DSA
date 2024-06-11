public class getter_setter {
    public static void main(String args[]){
        Pen penobj = new Pen();
        penobj.setcolor("red");
        penobj.settip(5);
        System.out.println(penobj.getcolor());
        System.out.println(penobj.gettip());



    }
    
}
class Pen{
    public String color;
    public int tip;
    
    public void setcolor(String color){
        this.color=color;
        //yaha pe this isliye use kiye hai bcz it tells the difference that this.color refers to the internal
        // one(refers to object initialise within class) and only color means wo bahar wala hai.
        // this is also used when dono same hota hai internal and external both string ek name se hai 
        // i.e color
    }
    public String getcolor(){
        return this.color;

    }
    public void settip(int newtip){
        tip=newtip;
    }
    public int gettip(){
        return tip;
    }
}
