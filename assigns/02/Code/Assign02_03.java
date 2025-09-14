import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Assign02_03 {
    public static boolean solve_3sum(Integer[] A) {
	// Please give a soft qudratic time implementation
	// that solves the 3-sum problem. The function call
	// solve_3sum(A) returns true if and only if there exist
	// indices i, j, and k satisfying A[i]+A[j] = A[k].
	// Why is your implementation soft O(n^2)?
		int i = 0;
		int j = i + 1;
		HashMap<Integer, List<Integer>> sums = new HashMap<>();

		while(i<A.length)
		{
			while(j<A.length)
			{
				List<Integer> indexes = new ArrayList<>();
				indexes.add(i);
				indexes.add(j);
				sums.put(A[i]+A[j],indexes);
				j++;
			}
			i++;
			j = i + 1;
		}

		for(i=0;i<A.length;i++)
		{
			if(sums.containsKey(A[i]))
			{
				return true;
			}
		}

		return false;
    }
    public static void main(String[] argv) {
	// Please write some code here for testing solve_3sum
		Integer[] A1 = {1, 2, 3};
		System.out.println("Test: " + solve_3sum(A1) + " - Expected: true");

		Integer[] A2 = {1, 5, 9};
		System.out.println("Test: " + solve_3sum(A2) + " - Expected: false");

		Integer[] A3 = {1, 2, 4, 5, 8};
		System.out.println("Test: " + solve_3sum(A3) + " - Expected: true");

		Integer[] A4 = {-2, -1, -3};
		System.out.println("Test: " + solve_3sum(A4) + " - Expected: true");

		Integer[] A5 = {0, 0, 0};
		System.out.println("Test: " + solve_3sum(A5) + " - Expected: true");

		Integer[] A6 = {10};
		System.out.println("Test: " + solve_3sum(A6) + " - Expected: false");

		Integer[] A7 = {};
		System.out.println("Test: " + solve_3sum(A7) + " - Expected: false");

		Integer[] A8 = {-1,0};
		System.out.println("Test: " + solve_3sum(A7) + " - Expected: false");
    }
}
