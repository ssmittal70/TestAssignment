package packageA;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharcterCount {

	public static void main(String[] args) {
		      String str1 = "Sachin Singh Mittal";
		      str1 = str1.replaceAll(" ", "");
		        char[] chars = str1.toCharArray();

		        Map<Character,Integer> h = new LinkedHashMap<>();
		        
		        for(char c : chars){
		          if (h.containsKey(c)){
		              h.put(c , h.get(c) +1 );
		          } 
		          else{
		            h.put(c, 1) ;
		          }  }
		        for(char ch : h.keySet()){
		           System.out.println(ch +":" +h.get(ch));
//		           if(h.get(ch)>1){
//		        	    System.out.println(ch +" Duplicate charcters count:" +h.get(ch));
//		           }
	}
} 
}
