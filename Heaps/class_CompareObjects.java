import java.util.*;
public class class_CompareObjects {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student S2){
            return this.rank-S2.rank;

        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 5));
        pq.add(new Student("B", 15));
        pq.add(new Student("C", 3));
        pq.add(new Student("D", 2));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+" -> "+pq.peek().rank);
            pq.remove();
        }
    }
    
}
