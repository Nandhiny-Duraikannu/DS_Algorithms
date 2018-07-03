import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CommutableIslands {
     static class Graph
    {
        int V;
        public LinkedList<Integer> adj_arr[];
        Graph(int v) {
            V = v;
            adj_arr = new LinkedList[V];
            for (int i = 0; i < V; ++i) {
                adj_arr[i] = new LinkedList<>();
            }
        }
            void addEdge(int v,int w)
            {
                adj_arr[v].add(w);
            }
    }

    public int findClusters(Graph t,int V)
    {

        String[] visited= new String[t.V];
        Arrays.fill(visited,"false");
        Queue<Integer> q=new LinkedList<Integer>();
        int count=1;

        for (String m:visited)
            System.out.println(m);
        boolean notVisited = Arrays.asList(visited).contains("false");
        while (notVisited) {
            q.add(V);
            visited[V]="true";
            System.out.println("IN WHILE " + count);
            while (!q.isEmpty()) {
                System.out.println(" q not empty");
                visited[q.peek()]= "true";
                int n = q.poll();
                System.out.println("polled:"+n+ " size:"+t.adj_arr[n].size());
                int list_size=t.adj_arr[n].size();
                for (int i=0;i< list_size;i++) {
                    System.out.println(t.adj_arr[n].get(i)+" added to q");
                    q.add(t.adj_arr[n].get(i));
                }

            }
            count++;
            System.out.println("end WHILE " + count);
            for(int i=0; i<visited.length; i++)
                if(visited[i] == "false")
                    V=i;
        }

        return 10;
    }
    public static void main(String[] args)
    {
        Graph g = new Graph(6);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(4,5);
        CommutableIslands c = new CommutableIslands();
        c.findClusters(g,0);

    }




}
