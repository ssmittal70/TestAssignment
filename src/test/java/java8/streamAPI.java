package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamAPI {

	public static void main(String[] args) {
		
		// 1st Example
		List<Integer> values = new ArrayList<Integer>();
		for(int i = 0 ; i< 100 ; i++) {
			values.add(i);
		}
		
		values.stream().filter(i -> i> 2 && i< 4).forEach(i->System.out.println(i));   // print 3
	//	System.out.println(values.stream().findFirst().orElse(9));    // print 0
		
		
		List<Integer> num = Arrays.asList(1, 2, 3, 4);  
		Stream<Integer> s = num.stream();              
		s.forEach(System.out::print);                  //  print 1234 using method reference

	}
	
	
	
	

}
