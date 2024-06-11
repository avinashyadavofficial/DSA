import java.util.*;
public class Haspath {
    static class Edge{
        int src;
        int dest;
        
        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
            
        }
    }
    public static boolean findhaspath(ArrayList<Edge>[] graph,int src,int dest,boolean vis[]){
       if(src==dest){
        return true;
       }
       vis[src]=true;
       for(int i=0;i<graph[src].size();i++){
        Edge e=graph[src].get(i);
        if((!vis[e.dest]) && findhaspath(graph, e.dest, dest, vis)){
            return true;
        }
        
       }return false;
      

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
        System.out.println(findhaspath(graph, 0, 5,new boolean[v]));
        


        

        
        
        

    }
    
}

