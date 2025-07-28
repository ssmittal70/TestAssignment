package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamAPI2 {

	public static void main(String[] args) {
		
		List <Integer> nums = Arrays.asList(6,5,2,8,1,7);
			nums.stream()
		             .sorted()
		             .filter(n-> n%2 ==1)                         // filtering odd numbers
		             .map(n -> n*2)                               // multiplying by 2 (2,10,14)
		             .forEach(n-> System.out.println(n));		  // printing all 
		            
		
		int a=	nums.stream()
	             .sorted()
	             .filter(n-> n%2 ==1)                         // filtering odd numbers
	             .map(n -> n*2)                               // multiplying by 2 (2,10,14)
	             .reduce(0,(c,e) ->c+e);            // Adding number's one after another, like (0+2) then(2+10) then (12+14)
	System.out.println("Sum of all numbers is " +a);
	}
}
