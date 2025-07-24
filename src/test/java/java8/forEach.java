package java8;

import java.util.Arrays;
import java.util.List;

public class forEach {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4);
		
//		Normal for loop
//		for(int i = 0; i<values.size(); i++) {
//			System.out.println(values.get(i));
//		}

//	    Advance for loop
//		for(int i :values) {                          // external for loop
//			System.out.println(i);
//		}
		
//		Using forEach and forEach2 expression:
		values.forEach(i -> System.out.println(i) );   // internal for loop
		
		
	}

}
