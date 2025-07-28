package packageA;

import java.util.HashMap;
import java.util.Map;

public class vowelsInString {

	public static void main(String[] args) {
		      String sentence = "My name is DEATHVADER, Hello World!!!";
		      char[] ch = sentence.toLowerCase().toCharArray();
		      Map<Character,Integer> h = new HashMap<>();
		      for(char c :ch){
		        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
		        if(h.containsKey(c)){
		          
		          h.put(c, h.get(c) +1);
		        }
		        else{
		          h.put(c, 1);
		        } } }
		      for(char ct: h.keySet()){
		        System.out.println(ct +" " + h.get(ct)); 
		       }

	}

}
