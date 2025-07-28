package packageA;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateIntegers {

	public static void main(String[] args) {
	    int[] num = {1, 2, 3, 4, 2, 1, 5, 6, 3, 7, 8, 9, 5};
    Set<Integer> h = new TreeSet<>();   // Used TreeSet to get results in ascending order and remove duplicates
    
    for(int n: num){
      h.add(n);
    }
       System.out.println("Unique numbers are " +h);

	}

}
