package packageA;

public class StringReverse {

	public static void main(String[] args) {
		 String str = "welcome to java";     // Expecting output :- emoclew ot avaj
	        String[] words = str.split("\\s"); // Split by space
	        String reverseWords = "";

	        for (String w : words) {
	            StringBuffer sb = new StringBuffer(w);
	          String c = sb.reverse().toString();
	            reverseWords = reverseWords + c + " "; // Add space after each reversed word
	        }
	        System.out.println("Reverse line is " + reverseWords.trim());
	} 
	
}
