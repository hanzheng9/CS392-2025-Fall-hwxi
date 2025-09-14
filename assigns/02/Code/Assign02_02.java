import java.util.Arrays;

public class Assign02_02 {
    /*
      HX-2025-02-13: 10 points
      Recursion is a fundamental concept in programming.
      However, the support for recursion in Java is very limited.
      Nontheless, we will be making extensive use of recursion in
      this class.
     */

    /*
    // This is a so-called iterative implementation:
    public static <T extends Comparable<T> > int indexOf(T[] a, T key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            final int mid = lo + (hi - lo) / 2;
	    final int sign = key.compareTo(a[mid]);
            if      (sign < 0) hi = mid - 1;
            else if (sign > 0) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    */
    public static <T extends Comparable<T> > int indexOf(T[] a, T key, int lo, int hi) {
	// Please give a recursive implementation of 'indexOf' that is
	// equivalent to the above one
        if(lo>hi)
        {
            return -1;
        }

        final int mid = lo + (hi - lo) / 2;
        final int sign = key.compareTo(a[mid]);
        if(sign<0)
        {
            return indexOf(a, key, lo, mid-1);
        }else if(sign>0)
        {
            return indexOf(a, key, mid+1, hi);
        }else
        {
            return mid;
        }
    }

    public void main(String[] argv) {
	// Please write some testing code for your implementation of 'indexOf'
        Integer[] numbers = {1, 3, 5, 7, 9, 11, 13};

        int index1 = indexOf(numbers, 7, 0, numbers.length - 1);
        System.out.println("Test: " + index1 + "-" + "Expected: " + "3");

        int index2 = indexOf(numbers, 1, 0, numbers.length - 1);
        System.out.println("Test: " + index2 + "-" + "Expected: " + "0");

        int index3 = indexOf(numbers, 13, 0, numbers.length - 1);
        System.out.println("Test: " + index3 + "-" + "Expected: " + "6");

        int index4 = indexOf(numbers, 4, 0, numbers.length - 1);
        System.out.println("Test: " + index4 + "-" + "Expected: " + "-1");

        Integer[] empty = {};
        int index5 = indexOf(empty, 1, 0, empty.length - 1);
        System.out.println("Test: " + index5 + "-" + "Expected: " + "-1"); 
    }
}
