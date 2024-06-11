public class constructors {
    public static void main(String args[]){
      
      Student obj=new Student(); // output: Constructor is called

       // ye Student() java automatically define kar leta agar ye niche define
      // nahi hota to, but agar Student() kuchh print kar raha hai phir define karna hoga
      //and agar koi parameterised constructor already define hai phir ye non-parameterised define karna hoga
      //agar use karna chahte hai to, apne se ab non parametrised constructor nahi define hoga

          Student obj1= new Student("Avinash");
          System.out.println(obj1.name);  // output : Avinash

          // yaha pe jab hum parameter diye hai constructor Student me to ab mandatory niche class Student me
          // define karna padega
    }
    
}
class Student{
    String name;
    int roll;
    
    //Student(){}
    //ye jo student define kiye hai ye constructor hai. but agar hum isme kuchh parameter nahi pass kar rahe 
    // hai to no need to define constructor bcz java automatically kar leta hai


    Student(String name){  // ye parametrised constructor hai
        this.name=name;

    }

    //or constructor can print also
    Student(){  // ye non- parameterised constructor hai
        System.out.println("Constructor is called");
    }

}
