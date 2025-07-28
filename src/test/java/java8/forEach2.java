package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// 1 way of doing it
//class consImpl implements Consumer<Integer>{
//public void accept(Integer i) {
//	System.out.println(i);
//}
//}

public class forEach2 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4);
		
		// 2nd way of doing it
//		Consumer<Integer> c = new Consumer<Integer>() {
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};
	
		// 3rd way of doing it
//		Consumer<Integer> c = (Integer i) -> System.out.println(i);
 		Consumer<Integer> c = i -> System.out.println(i);             // foreach take consumer object, consumer is functional interface
		values.forEach(c);  
	}
}
