import java.util.*;
public class Bfs {
    static class Edge{
        int src;
        int dest;
        
        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
            
        }
    }
    public static void breadfirstsearch(ArrayList<Edge>[] graph){
        Queue<Integer>q=new LinkedList<>();
        q.add(0);//first starting
        boolean visited[] = new boolean[graph.length];
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!visited[curr]){ //visit curr
                //print
                System.out.print(curr+" ");
                //vist to true
                visited[curr]=true;
                
                //adding all the adjacent vertices to queue
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }
    public static void CreateGraph(ArrayList<Edge>graph[]) {
        for (int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();

        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }    
    public static void main(String[] args) {
        int v=7; //vertex
        ArrayList<Edge>[]graph=new ArrayList[v];
        CreateGraph(graph);
        breadfirstsearch(graph);


        

        
        
        

    }
    
}

