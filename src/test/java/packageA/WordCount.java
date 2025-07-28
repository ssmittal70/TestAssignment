package packageA;

import java.util.LinkedHashMap;


public class WordCount {

    public static void main(String[] args) {
        String str = "This this is is done by Saket Saket";
        str = str.toLowerCase();
        String[] words = str.split(" +");
       
        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<>();    // Use LinkedHashMap to maintain insertion order

        for (String word : words) {
        	 if (wordCount.containsKey(word)) {
                 wordCount.put(word, wordCount.get(word) + 1);
             } else {
                 wordCount.put(word, 1);
        }
        }
        System.out.println("Word counts:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
