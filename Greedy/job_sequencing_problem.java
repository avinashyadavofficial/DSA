import java.util.*;
public class job_sequencing_problem {
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobsinfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();
        for(int i =0;i<jobsinfo.length;i++){
            jobs.add(new Job(i, jobsinfo[i][0], jobsinfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2) -> obj2.profit-obj1.profit);
        //sorted in descening order of profit
        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                 seq.add(curr.id);
                 time++;
            }
        }
        System.out.println("max jobs = " +seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i)+" ");

        }
        System.out.println();
    }
    
}
