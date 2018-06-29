import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int V;
    private LinkedList<Integer> adj[];
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
        adj[i] = new LinkedList();
    }
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    public void bfs(int s)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] visited = new boolean[4];
        q.add(s);
        visited[s]=true;
        while(q.size()!=0)
        {
            s = q.poll();
            System.out.println(s);

            Iterator<Integer> it= adj[s].listIterator();
            while (it.hasNext()) {
                int n = it.next();
                if (visited[n]==false) {
                    q.add(n);
                    visited[s]=true;
                }
            }

        }



    }
    public static void main(String[] args)
    {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.bfs(0);
    }
    }

