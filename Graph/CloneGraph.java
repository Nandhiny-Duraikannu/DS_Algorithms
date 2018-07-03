import java.util.*;

public class CloneGraph {

    public void cloneStruct(UndirectedGraphNode node) {



    }
    public static void main(String[] args)
    {
        UndirectedGraphNode g0 = new UndirectedGraphNode(0);
        UndirectedGraphNode g1 = new UndirectedGraphNode(1);
        UndirectedGraphNode g2 = new UndirectedGraphNode(2);
        UndirectedGraphNode g3 = new UndirectedGraphNode(3);
        UndirectedGraphNode g4 = new UndirectedGraphNode(4);
        UndirectedGraphNode g5 = new UndirectedGraphNode(5);
        g0.label=0;
        g0.neighbors.add(g1);
        g0.neighbors.add(g2);
        g0.neighbors.add(g3);
        g1.label=1;
        g1.neighbors.add(g0);
        g2.label=2;
        g2.neighbors.add(g0);
        g3.label=3;
        g3.neighbors.add(g0);
        g3.neighbors.add(g4);
        g4.label=4;
        g4.neighbors.add(g3);

        CloneGraph t = new CloneGraph();
        t.cloneStruct(g0);

    }

}
class UndirectedGraphNode {
      int label;
      List<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x)
      {
          label = x;
          neighbors = new ArrayList<UndirectedGraphNode>();
      }
  }
