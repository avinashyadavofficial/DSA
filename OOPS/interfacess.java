public class interfacess {
    public static void main(String[] args) {
        Queen q= new Queen();
        q.moves();
    }
    
}
interface  chessplayers{
    void moves(); // ye method pahle se hi public and abstract hota hai
}

class Queen implements chessplayers{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all direction)");
    }
}
class King implements chessplayers{
    public void moves(){
        System.out.println("up, down, left, right, )");
    }
}
