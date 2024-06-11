public class Objects {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // created a pen object class p1 and stored in HEAP memory.
        p1.setcolor("Red");
        System.out.println(p1.color);

    }

}

class Pen {
    String color;
    int tip;

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void setip(int newtip) {
        tip = newtip;
    }

}
