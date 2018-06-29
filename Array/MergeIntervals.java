import java.util.*;
import java.lang.*;
import java.io.*;

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}

public class MergeIntervals {
    public static void main(String[] args) throws java.lang.Exception {
        ArrayList<Interval> x = new ArrayList<Interval>();
        Interval i1 = new Interval(1, 4);
        Interval i2 = new Interval(4, 5);
//        Interval i3 = new Interval(8, 10);
//        Interval i4 = new Interval(15, 18);

        x.add(i1);
        x.add(i2);
//        x.add(i3);
//        x.add(i4);

        ArrayList<Interval> r = merge(x);

        for (Interval i : r) {
              System.out.println(i.start + " " + i.end);
        }

    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {

     for (int i=0;i<intervals.size()-1;i++)
     {
         int val1= intervals.get(i).end;
         int val2 =intervals.get(i+1).start;
         if (val1>val2 || val1==val2) {
             int addStart=intervals.get(i).start;
             int addEnd=intervals.get(i + 1).end;

             intervals.remove(i);
             intervals.set(i, new Interval(addStart, addEnd));


         }

     }
     return  intervals;
    }

}