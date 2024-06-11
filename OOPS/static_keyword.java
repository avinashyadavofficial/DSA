public class static_keyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.School="SRM";
        Student s2=new Student();
        System.out.println(s2.School);  // SRM print hoga bcz School static hai to sabke liye same hai
        System.out.println(s1.percentage(80, 90, 80));
       
    }
    
}
class Student{
    String name;
    static String School;
    
    static int percentage(int maths, int science, int sst){
        return maths+science+sst;
    }

}
