import java.util.*;
public class MedianSortedArrays {


    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        List<Integer> output = new ArrayList<>();
        int n = a.size()+b.size(),i=0,j=0,index=0;
        int size = (n%2 == 0)?(n/2): (int) Math.ceil(n / 2);
    //    System.out.println("size:"+size);
        while(size>=0) {
       //     System.out.println("size inside while:"+size);

         //   if(output.size()<=size) {
          //      System.out.println("size inside if");
                if (i < a.size() && (a.get(i) < b.get(j)) || j >= b.size()) {
                output.add(index, a.get(i));
            //    System.out.println(output.get(index));
                i++;
                    index++;

            } else if (j < b.size() && (a.get(i) > b.get(j)) || i >= a.size()) {
                output.add(index, b.get(j));
              //  System.out.println(output.get(index));
                j++;
                    index++;
            }
           // }
            size--;

         }
      double median = (n%2 == 0)?(output.get(output.size()-1)+output.get(output.size()-2))/2: output.get(output.size()-1);
return median;
    }

    public static void main(String[] args)
    {
        MedianSortedArrays med = new MedianSortedArrays();
        List<Integer> a= Arrays.asList(1,2);
        List<Integer> b= Arrays.asList(3,4);

        System.out.println("SqrtInt:"+med.findMedianSortedArrays(a,b));
    }

}
