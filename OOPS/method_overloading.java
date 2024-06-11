public class method_overloading {
    public static void main(String args[]){
        calculator cal=new calculator();
        System.out.println(cal.sum(2,3));
        System.out.println(cal.sum(2,3,4));
        System.out.println(cal.sum((float)2.5,(float)3.5));
    }
    
}
class calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
