package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {
		String str = "welcome to java";  // Expecting output: emoclew ot avaj

        String reversed = Arrays.stream(str.split("\\s"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));              // Join reversed words with space

        System.out.println("Reverse line is " + reversed);

	}

}
