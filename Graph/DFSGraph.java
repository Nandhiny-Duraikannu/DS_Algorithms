import java.util.*;
import java.io.*;

public class DFSGraph {

    private int V;
    private LinkedList<Integer> adj[];

    DFSGraph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }


    void DFS(int v) {
        boolean[] visited = new boolean[10];
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(v);
        visited[v] = true;
        System.out.println(v);
        while (!stk.isEmpty()) {
            v= stk.pop();
            Iterator<Integer> it = adj[v].listIterator();
            if (it.hasNext()) {
                v = it.next();
                if (visited[v] == false) {
                    System.out.println(v);
                    stk.push(v);
                    visited[v]=true;

                }
            }

        }

    }

    public static void main(String args[])
    {
        DFSGraph g = new DFSGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Depth First Traversal ");

        g.DFS(2);
    }
}