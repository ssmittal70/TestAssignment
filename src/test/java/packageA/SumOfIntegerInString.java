package packageA;

public class SumOfIntegerInString {

	public static void main(String[] args) {
		        String str = "test123d12a";
		        int a = 0;
		        int sum = 0;

		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);

		            if (Character.isDigit(ch)) {
		              a = Character.getNumericValue(ch);
		                sum = sum+ a;  
		            }   }
		        System.out.println("Sum is " + sum);

	}

}
