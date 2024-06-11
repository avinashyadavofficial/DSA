public class copy_constructor {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Avi";
        s1.roll=3;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=85;
        

        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[2]=90; 

        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);
        System.out.println(s2.marks[0]);
        System.out.println(s2.marks[1]);
        System.out.println(s2.marks[2]);

    }
    
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];
    
    //SHALLOW COPY  --> isme jab s1 me marks ke value change hoga to s2 me ho jayega automatically
    //Student (Student s1){
      //  marks=new int[3];
      //  this.name=s1.name;
       // this.roll=s1.roll;
        //this.marks=s1.marks;

   // }

    //DEEP COPY --? isme jab s1 me marks ke value change hoga to s2 me nahi hoga
    Student (Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }

    }


    
    Student(){
        marks=new int[3];
    }

    

  

}

