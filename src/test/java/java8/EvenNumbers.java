package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface NumberCondition {
 boolean test(int number);
}

public class EvenNumbers {

	public static void main(String[] args) {
		
		        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14, 17);
		        NumberCondition isEven = num -> num % 2 == 0;   // Lambda expression to define condition: even number

		        // Use Stream API with lambda
		        List<Integer> evenNumbers = numbers.stream()
		                .filter(isEven::test)  // using our functional interface
		                .collect(Collectors.toList());       //Take the result from the stream and collect it into a List

		        System.out.println("Even numbers: " + evenNumbers);
	}
}
